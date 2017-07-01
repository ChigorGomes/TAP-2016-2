package br.com.clinicamedica.classes;

/**
 * Classe Consulta - Representa um cadastramento do usuário e informações
 * informações
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class Usuario {

    private int idUsuario;
    private String nome;
    private String Usuario;
    private String senha;
    private String tipoUsuario;
    private String busca;

    /**
     * Construtor da classe
     */
    public Usuario() {

    }

    /**
     *
     * @param nome do usuario
     * @param tipoUsuario tipo usuário(médico,administrador,atendente)
     */
    public Usuario(String nome, String tipoUsuario) {

        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * Pega o identificador do usuario
     *
     * @return int identificador do usuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     *
     * @param idUsuario responsável por atribuir o valor a variável
     * identificadora do usuario
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * pega o nome do usuário
     *
     * @return String nome do usuario
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome responsável por atribuir o valor a variável nome do usuario
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Pega o usuario
     *
     * @return String usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     *
     * @param Usuario responsável por atribuir o valor a variável usuario
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * Pega a senha do usuario
     *
     * @return String senha do usuario
     */
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param senha responsável por atribuir o valor a variável senha do usuario
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Pega o tipo de usuario
     *
     * @return String tipo do usuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     *
     * @param tipoUsuario responsável por atribuir o valor a variável tipo do
     * usuario
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * Pega o nome do usuario por uma busca
     *
     * @return String busca o nome do usuario
     */
    public String getBusca() {
        return busca;
    }

    /**
     *
     * @param busca responsável por atribuir o valor a variável busca
     */
    public void setBusca(String busca) {
        this.busca = busca;
    }

}
