package br.com.clinicamedica.classes.DAO;

import br.com.clinicamedica.classes.Consulta;
import br.com.clinicamedica.classes.Prontuario;
import br.com.clinicamedica.conexao.Bd.BancoDeDados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 * Classe ProntuarioDAO - Implementação dos métodos
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class ProntuarioDAO extends BancoDeDados {

    /**
     * Construtor da classe
     */
    public ProntuarioDAO() {
        BancoDeDados.conecta();
    }

    Consulta consulta = new Consulta();

    /**
     * Método consultar
     *
     * @param data
     * @param status
     * @param codi
     * @return um vetor com os campos da consulta
     */
    public Vector<Consulta> consultar(String data, String status, int codi) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM agendamento inner join paciente on agendamento.idpaciente=paciente.idpaciente inner join medico on agendamento.idmedico=medico.idmedico where agendamento.idmedico=" + codi + " and DATACONSULTA='" + data + "' and statuss='" + status + "'");

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
     * Método salvar
     *
     * @param pront
     * @param cod
     * @return true se salvar e false caso não salve
     */
    public boolean salvar(Prontuario pront, int cod) {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO PRONTUARIO VALUES(NULL,'" + pront.getMedicamento() + "','" + pront.getResultado() + "', '" + pront.getPosologia() + "'," + cod + " )");
            JOptionPane.showMessageDialog(null, "Cadastro realizado!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar consulta \n" + ex);
            return false;
        }
    }

}
