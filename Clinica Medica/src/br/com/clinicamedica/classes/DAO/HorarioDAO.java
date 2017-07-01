package br.com.clinicamedica.classes.DAO;

import br.com.clinicamedica.classes.Horario;
import br.com.clinicamedica.classes.Usuario;
import br.com.clinicamedica.conexao.Bd.BancoDeDados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 * Classe HorarioDAO - Implementação dos métodos
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class HorarioDAO extends BancoDeDados {

    /**
     * Construtor da classe
     */
    public HorarioDAO() {
        BancoDeDados.conecta();

    }

    /**
     *Método mostra todos os horários de acordo com o médico
     * @param id
     * @return um vetor com os campos horario
     */
    public Vector<Horario> mostraTodosHorario(int id) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("select * from horarioconsulta inner join medico on medico.idmedico=horarioconsulta.idconsulta where IDMEDICO=" + id + " order by hora");

            Vector listaNomes = new Vector();
            listaNomes.add("");
            while (resultado.next()) {
                int codigo = resultado.getInt("IDHORARIOC");
                String hora = resultado.getString("HORA");
                Horario horas = new Horario(hora);

                listaNomes.add(hora);
            }
            return listaNomes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
