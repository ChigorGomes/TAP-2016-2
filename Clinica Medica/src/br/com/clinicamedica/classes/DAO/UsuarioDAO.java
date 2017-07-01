package br.com.clinicamedica.classes.DAO;

import br.com.clinicamedica.conexao.Bd.BancoDeDados;
import br.com.clinicamedica.classes.Usuario;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 * Classe UsuarioDAO - Implementação dos métodos
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class UsuarioDAO extends BancoDeDados {

    Usuario usuario = new Usuario();

    /**
     * Construtor da classe
     */
    public UsuarioDAO() {
        BancoDeDados.conecta();
    }

    /**
     * Método salvar
     *
     * @param usu
     * @return true se foi salvo ou false caso nção seja
     */
    public boolean salvar(Usuario usu) {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO USUARIO VALUES(NULL, ' " + usu.getNome() + "' ,'" + usu.getUsuario() + "' , '" + usu.getSenha() + "' , '" + usu.getTipoUsuario() + "')");
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!" + ex);
            return false;
        }

    }

    /**
     * Método acessar
     *
     * @param usu
     * @return true se o usuario e a senha correspondem ao cadastrado no sistema
     * ou false caso não esteja
     */
    public boolean acessar(Usuario usu) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM USUARIO WHERE USUARIO= '" + usu.getUsuario() + "' and SENHA='" + usu.getSenha() + "'");
            if (resultado.first()) {
                JOptionPane.showMessageDialog(null, "Acessado com sucesso! " + resultado.getString("TIPOUSUARIO"));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Acessado negado!");
            }

            return false;
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);

            return false;
        }
    }

    /**
     * Método controle acesso
     *
     * @param usu
     * @return true se os campo(USUARIO) esteja cadastrado no sistema ou false
     * caso não esteja
     */
    public boolean controleAcesso(Usuario usu) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM USUARIO WHERE USUARIO='" + usu.getUsuario() + "'");

            if (resultado.first() == true) {
                JOptionPane.showMessageDialog(null, "Usuário já cadastrado encontrado no sistema!");
                return true;

            } else {
                salvar(usu);
                return false;
            }

        } catch (SQLException e) {

            return false;

        }
    }

    /**
     * Método alterar
     *
     * @param usu
     * @return true se foi alterado ou false caso não seja
     */
    public boolean alterar(Usuario usu) {

        try {
            Statement st = conexao.createStatement();

            st.executeUpdate("UPDATE USUARIO SET NOME='" + usu.getNome() + "' , USUARIO='" + usu.getUsuario() + "' , SENHA='" + usu.getSenha() + "' ,TIPOUSUARIO='" + usu.getTipoUsuario() + "' WHERE IDUSUARIO=" + usu.getIdUsuario());
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
     * @param usu
     * @return true se foi excluido ou false caso não seja
     */
    public boolean excluir(Usuario usu) {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("DELETE FROM USUARIO WHERE IDUSUARIO=" + usu.getIdUsuario() + "");
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
            return false;
        }

    }

    /**
     * Método consulta paciente
     *
     * @param busca
     * @return um vetor com os campos do usuario
     */
    public Vector<Usuario> consultarPaciente(String busca) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM USUARIO WHERE NOME LIKE '%" + busca + "%'");
            Vector listaNomes = new Vector();
            while (resultado.next()) {
                String nome = resultado.getString("NOME");
                String tipo = resultado.getString("TIPOUSUARIO");
                Usuario us = new Usuario(nome, tipo);
                listaNomes.add(us);
            }
            return listaNomes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Método lista todos os usuarios
     *
     * @return um vetor com os nomes do usuario em ordem alfabetica
     */
    public Vector<Usuario> listaTodos() {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM USUARIO ");
            Vector listaNomes = new Vector();
            while (resultado.next()) {
                String nome = resultado.getString("NOME");
                String tipo = resultado.getString("TIPOUSUARIO");
                Usuario us = new Usuario(nome, tipo);

                listaNomes.add(us);
            }
            return listaNomes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Método acessar tabela
     *
     * @param usu
     * @param nome
     * @return true se o nome do usuario foi encontrado na tabela ou false caso
     * não seja
     */
    public boolean acessaTabela(Usuario usu, String nome) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM USUARIO WHERE NOME='" + nome + "'");
            resultado.first();
            usu.setIdUsuario(resultado.getInt("IDUSUARIO"));
            usu.setNome(resultado.getString("NOME"));
            usu.setUsuario(resultado.getString("USUARIO"));
            usu.setSenha(resultado.getString("SENHA"));
            usu.setTipoUsuario(resultado.getString("TIPOUSUARIO"));

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!" + ex);
            return false;
        }

    }

    /**
     * Método controle acesso usuario administrador
     *
     * @param nome
     * @return true se o tipo de usuario seja do tipo administrador
     */
    public boolean controleAcessoUsuarioADministrador(String nome) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM USUARIO WHERE USUARIO='" + nome + "'");
            resultado.first();
            if (resultado.getString("TIPOUSUARIO").equals("Administrador")) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            return false;
        }
    }

    /**
     * Método controle acesso usuario médico
     *
     * @param nome
     * @return true se o tipo de usuario seja do tipo medico
     */
    public boolean controleAcessoUsuarioMedico(String nome) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM USUARIO WHERE USUARIO='" + nome + "'");
            resultado.first();
            if (resultado.getString("TIPOUSUARIO").equals("Medico")) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            return false;
        }
    }

    /**
     * Método controle acesso usuario administrador
     *
     * @param nome
     * @return true se o tipo de usuario seja do tipo atendente
     */
    public boolean controleAcessoUsuarioAtendente(String nome) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM USUARIO WHERE USUARIO='" + nome + "'");
            resultado.first();
            if (resultado.getString("TIPOUSUARIO").equals("Atendente")) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            return false;
        }
    }

}
