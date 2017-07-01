package br.com.clinicamedica.classes.DAO;

import br.com.clinicamedica.classes.Consulta;
import br.com.clinicamedica.classes.Horario;
import br.com.clinicamedica.conexao.Bd.BancoDeDados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 * Classe ConsultaDAO - Implementação dos métodos
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class ConsultaDAO extends BancoDeDados {

    Consulta consulta = new Consulta();
    int idMedico;
    int idPaciente;

    /**
     * Construtor da classe
     */
    public ConsultaDAO() {
        BancoDeDados.conecta();
    }

    /**
     * Método salvar
     *
     * @param con
     * @return true(salvo) ou false(erro)
     */
    public boolean salvar(Consulta con) {
        buscaMedico(con.getNomeMed());
        buscaPaciente(con.getNomePac());

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO AGENDAMENTO VALUES(NULL," + idMedico + "," + idPaciente + ", '" + new java.sql.Date(con.getDataConsulta().getTime()) + "', '" + con.getHorario() + "', '" + con.getStatus() + "', '" + con.getObservacoes() + "')");
            JOptionPane.showMessageDialog(null, "Cadastro realizado!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar consulta \n" + ex);
            return false;
        }
    }

    /**
     * Método busca médico
     *
     * @param busca
     * @return true(achou) false(não encontrado)
     */
    public boolean buscaMedico(String busca) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM MEDICO WHERE NOMEMEDICO='" + busca + "'");
            resultado.first();
            idMedico = resultado.getInt("IDMEDICO");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Médico não cadastrado!");
            return false;
        }
    }

    /**
     * Método busca médico pelo identificador dele(id)
     *
     * @param busca
     * @return int caso encontre
     */
    public int buscaMe(String busca) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM MEDICO WHERE NOMEMEDICO='" + busca + "'");
            resultado.first();
            idMedico = resultado.getInt("IDMEDICO");
            return idMedico;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Médico não cadastrado!");

        }
        return idMedico;
    }

    /**
     * Método busca paciente
     *
     * @param busca
     * @return verdadeiro(achou) false(não encontrado)
     */
    public boolean buscaPaciente(String busca) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM PACIENTE WHERE NOMEPAC='" + busca + "'");
            resultado.first();
            idPaciente = resultado.getInt("IDPACIENTE");

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
            return false;
        }
    }

    /**
     * Método consulta pelo identificador do codigo
     *
     * @param cod
     * @return todos os campos da consulta caso encontre
     */
    public Consulta buscaAgendaporCodigo(int cod) {

        Consulta consulta2 = new Consulta();
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM AGENDAMENTO inner join  paciente on agendamento.idpaciente= paciente.idpaciente inner join medico on agendamento.idmedico=medico.idmedico where idagendamento='" + cod + "'");
            resultado.first();
            consulta2.setIdConsulta(resultado.getInt("IDAGENDAMENTO"));
            consulta2.setNomePac(resultado.getString("NOMEPAC"));
            consulta2.setNomeMed(resultado.getString("NOMEMEDICO"));
            consulta2.setObservacoes(resultado.getString("OBSERVACOES"));
            consulta2.setNasc(resultado.getDate("NASCIMENTO"));
            consulta2.setCrm(resultado.getString("CRM"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar!" + ex);

        }
        return consulta2;
    }

    /**
     * Método consulta
     *
     * @param data
     * @param status
     * @return um vetor com os campos do agendamento
     */
    public Vector<Consulta> consultar(String data, String status) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM agendamento inner join paciente on agendamento.idpaciente=paciente.idpaciente inner join medico on agendamento.idmedico=medico.idmedico where DATACONSULTA='" + data + "' and statuss='" + status + "' order by nomemedico");

            Vector listaNomes = new Vector();

            while (resultado.next()) {
                int codigo = resultado.getInt("IDAGENDAMENTO");
                String nomeMedico = resultado.getString("NOMEMEDICO");
                String horario = resultado.getString("HORARIO");
                Date dataConsulta = resultado.getDate("DATACONSULTA");
                String nomePaciente = resultado.getString("NOMEPAC");
                String estado = resultado.getString("STATUSS");
                Consulta con = new Consulta(codigo, dataConsulta, horario, estado, nomeMedico, nomePaciente);

                listaNomes.add(con);
            }
            return listaNomes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Método acessar tabela
     *
     * @param con
     * @param agenda
     * @return true caso encontre e false se não encontrar
     */
    public boolean acessaTabela(Consulta con, int agenda) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM AGENDAMENTO WHERE IDAGENDAMENTO=" + agenda + "");
            resultado.first();

            con.setIdConsulta(resultado.getInt("IDAGENDAMENTO"));

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!" + ex);
            return false;
        }

    }

    /**
     * Método alterar
     *
     * @param con
     * @return true(alterado) false(não alterado)
     */
    public boolean alterar(Consulta con) {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("UPDATE AGENDAMENTO SET STATUSS='" + con.getStatus() + "' WHERE IDAGENDAMENTO=" + con.getIdConsulta());
            //JOptionPane.showMessageDialog(null, "Agendamento em andamento!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar!");
            return false;
        }

    }

    /**
     * Método consultar
     *
     * @param data
     * @param status
     * @param cod
     * @return um vetor com os campos da consulta
     */
    public Vector<Consulta> consu(String data, String status, int cod) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM agendamento inner join paciente on agendamento.idpaciente=paciente.idpaciente inner join medico on agendamento.idmedico=medico.idmedico where agendamento.idmedico=" + cod + " and DATACONSULTA='" + data + "' and statuss='" + status + "'");

            Vector listaNomes = new Vector();

            while (resultado.next()) {
                int codigo = resultado.getInt("IDAGENDAMENTO");

                String nomeMedico = resultado.getString("NOMEMEDICO");
                String horario = resultado.getString("HORARIO");
                Date dataConsulta = resultado.getDate("DATACONSULTA");
                String nomePaciente = resultado.getString("NOMEPAC");
                String estado = resultado.getString("STATUSS");
                Consulta con = new Consulta(codigo, dataConsulta, horario, estado, nomeMedico, nomePaciente);

                listaNomes.add(con);
            }
            return listaNomes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Método controle de agendamento
     *
     * @param con
     * @param id
     * @return true caso já exista um agendamento para aquele horário ou false
     * caso não haja
     */
    public boolean controleAgendamento(Consulta con, int id) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM AGENDAMENTO INNER JOIN medico on medico.idmedico=agendamento.idmedico WHERE DATACONSULTA='" + new java.sql.Date(con.getDataConsulta().getTime()) + "' and HORARIO='" + con.getHorario() + "' and medico.idmedico=" + id);

            if (resultado.first() == true) {
                JOptionPane.showMessageDialog(null, "Horário já marcado para consulta!");
                return true;

            } else {
                salvar(con);
                return false;
            }

        } catch (SQLException e) {

            return false;

        }
    }

}
