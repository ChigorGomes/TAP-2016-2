package br.com.clinicamedica.conexao.Bd;

import java.sql.*;

/**
 * Conexão Banco de Dados MYsql
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class BancoDeDados {

    public Statement stm;
    public ResultSet rs;
    private static String url = "jdbc:mysql://localhost:3306/clinica";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String pass = "root";
    protected static Connection conexao = null;

    public static boolean conecta() {

        try {
            conexao = DriverManager.getConnection(url, user, pass);

            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            return false;

        }
    }

    public static boolean desconecta() {
        try {
            conexao.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

}
