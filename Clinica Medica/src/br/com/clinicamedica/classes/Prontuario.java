package br.com.clinicamedica.classes;

/**
 * Classe Consulta - Representa um cadastramento do prontuário do médico e
 * informações
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class Prontuario {

    private int idProntuario;
    private String medicamento;
    private String resultado;
    private String posologia;
    private String observacao;
    private int idConsulta;

    /**
     *
     * @param idProntuario identificador do prontuario
     * @param medicamento nome do medicamento
     * @param resultado resultado da consulta
     * @param posologia dosagem do medicamento
     * @param observacao observacao da consulta
     * @param idConsulta identificador da consulta
     */
    public Prontuario(int idProntuario, String medicamento, String resultado, String posologia, String observacao, int idConsulta) {
        this.idProntuario = idProntuario;
        this.medicamento = medicamento;
        this.resultado = resultado;
        this.posologia = posologia;
        this.observacao = observacao;
        this.idConsulta = idConsulta;
    }

    /**
     * Construtor da classe
     */
    public Prontuario() {
    }

    /**
     * Pega o identificador da consulta
     *
     * @return int identificador da consulta
     */
    public int getIdConsulta() {
        return idConsulta;
    }

    /**
     *
     * @param idConsulta responsável por atribuir o valor a variável
     * identificadora da consulta
     */
    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    /**
     * Pega o identificador do prontuario
     *
     * @return int identificador do prontuario
     */
    public int getIdProntuario() {
        return idProntuario;
    }

    /**
     *
     * @param idProntuario responsável por atribuir o valor a variável
     * identificadora do prontuario
     */
    public void setIdProntuario(int idProntuario) {
        this.idProntuario = idProntuario;
    }

    /**
     * Pega o medicamento
     *
     * @return String medicamento
     */
    public String getMedicamento() {
        return medicamento;
    }

    /**
     *
     * @param medicamento responsável por atribuir o valor a variável
     * medicamento
     */
    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    /**
     * Pega o resultado
     *
     * @return String resultado
     */
    public String getResultado() {
        return resultado;
    }

    /**
     *
     * @param resultado responsável por atribuir o valor a variável resultado
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    /**
     * Pega a posologia(dosagem)
     *
     * @return String posologia
     */
    public String getPosologia() {
        return posologia;
    }

    /**
     *
     * @param posologia responsável por atribuir o valor a variável posologia
     */
    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    /**
     * Pega a observacao
     *
     * @return String observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     *
     * @param observacao responsável por atribuir o valor a variável observacao
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
