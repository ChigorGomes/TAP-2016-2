package br.com.clinicamedica.classes;

import java.util.Date;

/**
 * Classe Consulta - Representa um cadastramento de consultas e informações
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class Consulta {

    private int idAgendamento;
    private Date dataConsulta;
    private String horario;
    private String observacoes;
    private String status;
    private String busca;
    private String nomeMed;
    private String nomePac;
    private String nascimento;
    private String crm;
    private Date nasc;

    /**
     * Construtor da Classe
     *
     */
    public Consulta() {
    }

    /**
     * Construtores da Classe
     *
     * @param observacoes observações que o médico faz ao paciente
     * @param nomeMed nome do médico
     * @param nomePac nome Paciente
     * @param nascimento data de nascimento do paciente
     * @param crm número de identificação do médico
     */
    public Consulta(String observacoes, String nomeMed, String nomePac, String nascimento, String crm) {
        this.observacoes = observacoes;
        this.nomeMed = nomeMed;
        this.nomePac = nomePac;
        this.nascimento = nascimento;
        this.crm = crm;
    }

    /**
     *
     * @param idAgendamento identificação do agendamento no BD
     * @param dataConsulta data da consulta
     * @param horario horário da consulta
     * @param status status da consulta
     * @param nomeMed nome do médico
     * @param nomePac nome do paciente
     */
    public Consulta(int idAgendamento, Date dataConsulta, String horario, String status, String nomeMed, String nomePac) {
        this.idAgendamento = idAgendamento;
        this.dataConsulta = dataConsulta;
        this.horario = horario;
        this.status = status;
        this.nomeMed = nomeMed;
        this.nomePac = nomePac;
    }

    /**
     * pega a data de nascimento
     *
     * @return int data de nascimento do paciente
     */
    public Date getNasc() {
        return nasc;
    }

    /**
     *
     * @param nasc responsável por atribuir o valor a variável nascimento
     */
    public void setNasc(Date nasc) {
        this.nasc = nasc;
    }

    /**
     * pega o crm
     *
     * @return String crm do médico
     */
    public String getCrm() {
        return crm;
    }

    /**
     *
     * @param crm responsável por atribuir o valor a variável CRM
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }

    /**
     * pega o id agendamento
     *
     * @return int do id agendamento
     */
    public int getIdAgendamento() {
        return idAgendamento;
    }

    /**
     *
     * @param idAgendamento responsável por atribuir o valor a variável
     * identificadora do agendamento
     */
    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    /**
     * pega a data de nascimento do paciente
     *
     * @return String nascimento do paciente
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     *
     * @param nascimento responsável por atribuir o valor a variável nascimento
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * Pega o nome do médico
     *
     * @return String nome do médico
     */
    public String getNomeMed() {
        return nomeMed;
    }

    /**
     *
     * @param nomeMed responsável por atribuir o valor a variável nome do médico
     */
    public void setNomeMed(String nomeMed) {
        this.nomeMed = nomeMed;
    }

    /**
     * Pega o nome do paciente
     *
     * @return String nome do paciente
     */
    public String getNomePac() {
        return nomePac;
    }

    /**
     *
     * @param nomePac responsável por atribuir o valor a variável nome do
     * paciente
     */
    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }

    /**
     * Pega o identificado da consulta
     *
     * @return int identificador da consulta
     */
    public int getIdConsulta() {
        return idAgendamento;
    }

    /**
     *
     * @param idConsulta responsável por atribuir o valor a variável
     * identificadora da consulta
     */
    public void setIdConsulta(int idConsulta) {
        this.idAgendamento = idConsulta;
    }

    /**
     * Pega a data da consulta
     *
     * @return Date data da consulta
     */
    public Date getDataConsulta() {
        return dataConsulta;
    }

    /**
     *
     * @param dataConsulta responsável por atribuir o valor a variável Data da
     * consulta
     */
    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    /**
     * Pega o horário da consulta
     *
     * @return String horário da consulta
     */
    public String getHorario() {
        return horario;
    }

    /**
     *
     * @param horario responsável por atribuir o valor a variável horário da
     * consulta
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * Pega a observação
     *
     * @return String observação da consulta
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     *
     * @param observacoes responsável por atribuir o valor a variável observação
     * da consulta
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * Pega o status da consulta
     *
     * @return String status da consulta
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status responsável por atribuir o valor a variável status da
     * consulta
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Pega a busca do nome do paciente
     *
     * @return String busca o nome do paciente
     */
    public String getBusca() {
        return busca;
    }

    /**
     *
     * @param busca responsável por atribuir o valor a variável busca nome do
     * paciente
     */
    public void setBusca(String busca) {
        this.busca = busca;
    }
}
