package br.com.clinicamedica.classes;

/**
 * Classe Consulta - Representa um cadastramento do Médico e informações
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class Medico {

    private int idMedico;
    private String nome;
    private String rg;
    private String cpf;
    private String especialidade;
    private String crm;
    private String email;
    private String telefone;
    private String celular;
    private int codLaudo;
    private String busca;

    /**
     * Construtor da classe médico
     */
    public Medico() {

    }

    /**
     * Construtor da classe médico
     *
     * @param nome nome do médico
     */
    public Medico(String nome) {
        this.nome = nome;
    }

    /**
     * Construtor da classe
     *
     * @param nome nome do médico
     * @param especialidade especialidade do médico
     * @param crm crm do médico
     */
    public Medico(String nome, String especialidade, String crm) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    /**
     * Pega o nome do médico pela varável busca
     *
     * @return String busca
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

    /**
     * Pega o id médico
     *
     * @return int identificador médico
     */
    public int getIdMedico() {
        return idMedico;
    }

    /**
     *
     * @param idMedico responsável por atribuir o valor a variável
     * identificadora do médico
     */
    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    /**
     * Pega o nome do Médico
     *
     * @return String nome do médico
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome responsável por atribuir o valor a variável nome do médico
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Pega o RG do médico
     *
     * @return String Rg
     */
    public String getRg() {
        return rg;
    }

    /**
     *
     * @param rg responsável por atribuir o valor a variável Rg do médico
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * Pega o cpf do médico
     *
     * @return String cpfdo médico
     */
    public String getCpf() {
        return cpf;
    }

    /**
     *
     * @param cpf responsável por atribuir o valor a variável cpf do médico
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Pega a especialidade do médico
     *
     * @return String especialidade do médico
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     *
     * @param especialidade responsável por atribuir o valor a variável
     * especialidade do médico
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * Pega o crm do médico
     *
     * @return String crm do médico
     */
    public String getCrm() {
        return crm;
    }

    /**
     *
     * @param crm responsável por atribuir o valor a variável crm do médico
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }

    /**
     * Pega o email do médico
     *
     * @return String email do médico
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email responsável por atribuir o valor a variável email do médico
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Pega o telefone do médico
     *
     * @return String telefone do médico
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     *
     * @param telefone responsável por atribuir o valor a variável telefone do
     * médico
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Pega o celular do médico
     *
     * @return String celular do médico
     */
    public String getCelular() {
        return celular;
    }

    /**
     *
     * @param celular responsável por atribuir o valor a variável celular do
     * médico
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Pega o código do laudo
     *
     * @return int código do laudo
     */
    public int getCodLaudo() {
        return codLaudo;
    }

    /**
     *
     * @param codLaudo responsável por atribuir o valor a variável código do
     * laudo
     */
    public void setCodLaudo(int codLaudo) {
        this.codLaudo = codLaudo;
    }

    /**
     * Pega o nome do médico
     *
     * @return String nome do médico
     */
    @Override
    public String toString() {
        return this.nome;
    }

}
