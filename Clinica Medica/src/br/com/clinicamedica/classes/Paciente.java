package br.com.clinicamedica.classes;

import java.util.Date;

/**
 * Classe Consulta - Representa um cadastramento do paciente e informações
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class Paciente {

    private int idPaciente;
    private String nome;
    private String rg;
    private String cpf;
    private String email;
    private String telefone;
    private String celular;
    private Date nasc;
    private String busca;
    private String endereco;
    private String nascimento;
    private String cep;

    /**
     * Construtor da classe
     */
    public Paciente() {
    }

    /**
     * Pega a data de nascimento do paciente
     *
     * @return String data de nascimento do paciente
     */
    public Date getNasc() {
        return nasc;
    }

    /**
     *
     * @param nasc responsável por atribuir o valor a variável nascimento do
     * paciente
     */
    public void setNasc(Date nasc) {
        this.nasc = nasc;
    }

    /**
     *
     * @param nome nome do paciente
     * @param rg rg do paciente
     * @param cpf cpf do paciente
     * @param telefone telefone do paciente
     * @param celular celular do paciente
     * @param nasc data de nascimento do paciente
     */
    public Paciente(String nome, String rg, String cpf, String telefone, String celular, Date nasc) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
        this.nasc = nasc;
    }

    /**
     *
     * @param nome
     * @param rg
     * @param cpf
     * @param telefone
     * @param celular
     * @param nascimento
     */
    public Paciente(String nome, String rg, String cpf, String telefone, String celular, String nascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
        this.nascimento = nascimento;
    }

    /**
     * Pega o id do paciente
     *
     * @return int identificador do paciente
     */
    public int getIdPaciente() {
        return idPaciente;
    }

    /**
     *
     * @param idPaciente responsável por atribuir o valor a variável
     * identificadora do paciente
     */
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * Pega o nome do paciente
     *
     * @return String nome do paciente
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome responsável por atribuir o valor a variável nome do paciente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Pega o rg do paciente
     *
     * @return String rg do paciente
     */
    public String getRg() {
        return rg;
    }

    /**
     *
     * @param rg responsável por atribuir o valor a variável rg do paciente
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * Pega o cpf do paciente
     *
     * @return String cpf do paciente
     */
    public String getCpf() {
        return cpf;
    }

    /**
     *
     * @param cpf responsável por atribuir o valor a variável cpf do paciente
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Pega o email do paciente
     *
     * @return String email do paciente
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email responsável por atribuir o valor a variável email do
     * paciente
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Pega o telefone do paciente
     *
     * @return String telefone do paciente
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     *
     * @param telefone responsável por atribuir o valor a variável telefone do
     * paciente
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Pega o celular do paciente
     *
     * @return String celular do paciente
     */
    public String getCelular() {
        return celular;
    }

    /**
     *
     * @param celular responsável por atribuir o valor a variável celular do
     * paciente
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Pega o nome do paciente usando uma busca
     *
     * @return String nome do paciente passado como busca
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
     * Pega o endereco do paciente
     *
     * @return String endereco do paciente
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     *
     * @param endereco responsável por atribuir o valor a variável endereco do
     * paciente
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Pega a data de nascimento do paciente
     *
     * @return String data de nascimento do paciente
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     *
     * @param nascimento responsável por atribuir o valor a variável data de
     * nascimento do paciente
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * Pega o cep do paciente
     *
     * @return String cep do paciente
     */
    public String getCep() {
        return cep;
    }

    /**
     *
     * @param cep responsável por atribuir o valor a variável cep do paciente
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

}
