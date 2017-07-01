package br.com.clinicamedica.classes.DAO;

import br.com.clinicamedica.conexao.Bd.BancoDeDados;
import br.com.clinicamedica.classes.Medico;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 * Classe MedicoDAO - Implementação dos métodos
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class MedicoDAO extends BancoDeDados {

    Medico medico = new Medico();

    /**
     * Construtor da classe
     */
    public MedicoDAO() {
        BancoDeDados.conecta();
    }

    /**
     * Método salvar
     *
     * @param med
     * @return true se salvar ou false caso não salve
     */
    public boolean salvar(Medico med) {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO medico VALUES(NULL,'" + med.getNome() + "','" + med.getRg() + "', '" + med.getCpf() + "','" + med.getEspecialidade() + "','"
                    + med.getCrm() + "','" + med.getEmail() + "','" + med.getTelefone() + "','" + med.getCelular() + "',NULL)");
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!" + ex);
            return false;
        }

    }

    /**
     * Método controle acesso
     *
     * @param med
     * @return true caso os campos (RG,CPF,CRM,EMAIL) já esteja cadastrado no
     * sistema ou false caso não esteja
     */
    public boolean controleAcesso(Medico med) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM MEDICO WHERE RG='" + med.getRg() + "' or CPF='" + med.getCpf() + "' or CRM='" + med.getCrm()
                    + "' or EMAIL='" + med.getEmail() + "'");

            if (resultado.first()) {
                JOptionPane.showMessageDialog(null, "Usuário já cadastrado (RG,CPF,CRM,EMAIL) encontrado no sistema!");
                return true;

            } else {
                salvar(med);
            }
            return true;

        } catch (SQLException e) {

            return false;

        }
    }

    /**
     * Método alterar
     *
     * @param med
     * @return true se foi alterado ou false não foi alterado
     */
    public boolean alterar(Medico med) {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("UPDATE MEDICO SET NOMEMEDICO='" + med.getNome() + "' , RG='" + med.getRg() + "' , CPF='" + med.getCpf() + "' , ESPECIALIDADE='" + med.getEspecialidade() + "' , CRM='" + med.getCrm() + "' , EMAIL='"
                    + med.getEmail() + "' , TELEFONE='" + med.getTelefone() + "' , CELULAR= '" + med.getCelular() + "' WHERE IDMEDICO=" + med.getIdMedico());
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não alterados!");
            return false;
        }
    }

    /**
     * Método excluir
     *
     * @param med
     * @return true se foi excluido ou false se não foi
     */
    public boolean excluir(Medico med) {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("DELETE FROM MEDICO WHERE IDMEDICO=" + med.getIdMedico() + "");
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
            return false;
        }

    }

    /**
     * Método consultar
     *
     * @param busca
     * @return um vetor com os campos do médico
     */
    public Vector<Medico> consultar(String busca) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM MEDICO WHERE NOMEMEDICO LIKE '%" + busca + "%'");

            Vector listaNomes = new Vector();

            while (resultado.next()) {
                int codigo = resultado.getInt("IDMEDICO");
                String nome = resultado.getString("NOMEMEDICO");
                String crm = resultado.getString("CRM");
                String especialidade = resultado.getString("ESPECIALIDADE");
                Medico med = new Medico(nome, especialidade, crm);

                listaNomes.add(med);
            }
            return listaNomes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Método mostra todos os medicos
     *
     * @return todos os médicos em ordem alfabetica
     */
    public Vector<Medico> mostraTodos() {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM MEDICO ORDER BY NOMEMEDICO");

            Vector listaNomes = new Vector();
            while (resultado.next()) {
                int codigo = resultado.getInt("IDMEDICO");
                String nome = resultado.getString("NOMEMEDICO");
                String crm = resultado.getString("CRM");
                String especialidade = resultado.getString("ESPECIALIDADE");
                Medico med = new Medico(nome, especialidade, crm);

                listaNomes.add(med);
            }
            return listaNomes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     *
     * @return
     */
    public Vector<Medico> mostraTodosPersonal() {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM MEDICO ORDER BY NOMEMEDICO");

            Vector listaNomes = new Vector();
            listaNomes.add("");
            while (resultado.next()) {
                int codigo = resultado.getInt("IDMEDICO");
                String nome = resultado.getString("NOMEMEDICO");
                String crm = resultado.getString("CRM");
                String especialidade = resultado.getString("ESPECIALIDADE");
                Medico med = new Medico(nome, especialidade, crm);

                listaNomes.add(med);
            }
            return listaNomes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Método acessar tabela
     *
     * @param med
     * @param nome
     * @return true caso encontre o nome na tabela false caso não encontre
     */
    public boolean acessaTabela(Medico med, String nome) {
        try {
            Statement st = conexao.createStatement();

            ResultSet resultado = st.executeQuery("SELECT * FROM MEDICO WHERE NOMEMEDICO='" + nome + "'");
            resultado.first();
            if (resultado.first() == false) {
                return false;

            } else {
                med.setIdMedico(resultado.getInt("IDMEDICO"));

                med.setIdMedico(resultado.getInt("IDMEDICO"));
                med.setNome(resultado.getString("NOMEMEDICO"));
                med.setRg(resultado.getString("RG"));
                med.setCpf(resultado.getString("CPF"));
                med.setEspecialidade(resultado.getString("ESPECIALIDADE"));
                med.setCrm(resultado.getString("CRM"));
                med.setEmail(resultado.getString("EMAIL"));
                med.setTelefone(resultado.getString("TELEFONE"));
                med.setCelular(resultado.getString("CELULAR"));
            }

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!" + ex);
            return false;
        }

    }

}
