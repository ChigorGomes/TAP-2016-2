package br.com.clinicamedica.classes.DAO;

import br.com.clinicamedica.classes.Paciente;
import br.com.clinicamedica.conexao.Bd.BancoDeDados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 * Classe PacienteDAO - Implementação dos métodos
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class PacienteDAO extends BancoDeDados {

    Paciente paciente = new Paciente();

    /**
     * Construtor da classe
     */
    public PacienteDAO() {
        BancoDeDados.conecta();
    }

    /**
     * Método salvar
     *
     * @param pac
     * @return true se foi salvo false caso não seja
     */
    public boolean salvar(Paciente pac) {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO PACIENTE VALUES(NULL,'" + pac.getNome() + "' , '" + pac.getRg() + "'  , '" + pac.getCpf() + "' , '" + pac.getEmail() + "' , '" + pac.getTelefone() + "' , '"
                    + pac.getCelular() + "' ,'" + pac.getEndereco() + "' , ' " + pac.getCep() + "' , '" + new java.sql.Date(pac.getNasc().getTime()) + "')");
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!" + ex);
            return false;
        }

    }

    /**
     * Método controle de acesso
     *
     * @param pac
     * @return true se os campos(RG,CPF,EMAIL) esteja cadastrado no sistema ou
     * false caso não esteja
     */
    public boolean controleAcesso(Paciente pac) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM PACIENTE WHERE RG='" + pac.getRg() + "' or CPF='" + pac.getCpf() + "' or EMAIL='" + pac.getEmail() + "'");

            if (resultado.first() == true) {
                JOptionPane.showMessageDialog(null, "Usuário já cadastrado (RG,CPF,EMAIL) encontrado no sistema!");
                return true;

            } else {
                salvar(pac);
                return false;
            }

        } catch (SQLException e) {

            return false;

        }
    }

    /**
     * Método busca paciente
     *
     * @param pac
     * @return verdairo caso encontre ou false caso não encontre
     */
    public boolean buscaPaciente(Paciente pac) {

        try {

            Statement st = conexao.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            ResultSet resultado = st.executeQuery("SELECT * FROM PACIENTE WHERE NOMEPAC LIKE '%" + pac.getBusca() + "%'");
            resultado.first();
            pac.setIdPaciente(resultado.getInt("IDPACIENTE"));
            pac.setNome(resultado.getString("NOMEPAC"));
            pac.setRg(resultado.getString("RG"));
            pac.setCpf(resultado.getString("CPF"));
            pac.setEmail(resultado.getString("EMAIL"));
            pac.setTelefone(resultado.getString("TELEFONE"));
            pac.setCelular(resultado.getString("CELULAR"));
            pac.setEndereco(resultado.getString("ENDERECO"));
            pac.setCep(resultado.getString("CEP"));
            pac.setNasc(resultado.getDate("NASCIMENTO"));

            return true;
        } catch (SQLException ex) {

            return false;
        }
    }

    /**
     * Método alterar
     *
     * @param pac
     * @return true se foi alterado ou false caso não seja
     */
    public boolean alterar(Paciente pac) {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("UPDATE PACIENTE SET NOMEPAC='" + pac.getNome() + "' ,RG='" + pac.getRg() + "' ,CPF='" + pac.getCpf() + "' ,EMAIL='" + pac.getEmail() + "' , TELEFONE='" + pac.getTelefone()
                    + "' , CELULAR='" + pac.getCelular() + "' , ENDERECO='" + pac.getEndereco() + "' , CEP='" + pac.getCep() + "', NASCIMENTO='" + new java.sql.Date(pac.getNasc().getTime()) + "' WHERE IDPACIENTE=" + pac.getIdPaciente());
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
     * @param pac
     * @return true se foi excluido ou false caso não seja
     */
    public boolean excluir(Paciente pac) {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("DELETE FROM PACIENTE WHERE IDPACIENTE=" + pac.getIdPaciente() + "");
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
     * @return um vetor com os campos do paciente
     */
    public Vector<Paciente> consultar(String busca) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM PACIENTE WHERE NOMEPAC LIKE '%" + busca + "%'");

            Vector listaNomes = new Vector();

            while (resultado.next()) {
                int codigo = resultado.getInt("IDPACIENTE");
                String nome = resultado.getString("NOMEPAC");
                String rg = resultado.getString("RG");
                String cpf = resultado.getString("CPF");
                String celular = resultado.getString("TELEFONE");
                String telefone = resultado.getString("CELULAR");
                Date nasc = resultado.getDate("NASCIMENTO");
                Paciente p = new Paciente(nome, rg, cpf, telefone, celular, nasc);

                listaNomes.add(p);
            }
            return listaNomes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Método mostra todos os paciente
     *
     * @return um vetor com os paciente em ordem alfabetica
     */
    public Vector<Paciente> mostrarTodos() {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM PACIENTE ORDER BY NOMEPAC");

            Vector listaNomes = new Vector();

            while (resultado.next()) {
                int codigo = resultado.getInt("IDPACIENTE");
                String nome = resultado.getString("NOMEPAC");
                String rg = resultado.getString("RG");
                String cpf = resultado.getString("CPF");
                String celular = resultado.getString("TELEFONE");
                String telefone = resultado.getString("CELULAR");
                Date nasc = resultado.getDate("NASCIMENTO");
                Paciente p = new Paciente(nome, rg, cpf, telefone, celular, nasc);
                listaNomes.add(p);
            }
            return listaNomes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Método acessar tabela
     *
     * @param pac
     * @param nome
     * @return true se foi encontrado o nome do paciente na tabela ou false caso
     * não seja
     */
    public boolean acessaTabela(Paciente pac, String nome) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM PACIENTE WHERE NOMEPAC='" + nome + "'");
            resultado.first();
            pac.setIdPaciente(resultado.getInt("IDPACIENTE"));
            pac.setNome(resultado.getString("NOMEPAC"));
            pac.setEmail(resultado.getString("EMAIL"));
            pac.setRg(resultado.getString("RG"));
            pac.setCpf(resultado.getString("CPF"));
            pac.setTelefone(resultado.getString("TELEFONE"));
            pac.setCelular(resultado.getString("CELULAR"));
            pac.setEndereco(resultado.getString("ENDERECO"));
            pac.setCep(resultado.getString("CEP"));
            pac.setNasc(resultado.getDate("NASCIMENTO"));
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!" + ex);
            return false;
        }

    }
}
