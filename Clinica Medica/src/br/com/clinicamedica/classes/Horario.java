package br.com.clinicamedica.classes;

/**
 * Classe horário - Representa um cadastramento do horário da consulta
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class Horario {

    private int idhorario;
    private String hora;
    //private String diasTrabalhados;
    private String nomeMedico;

    /**
     * Construtores da Classe
     */
    public Horario() {
    }

    /**
     * Construtor da classe
     *
     * @param hora horário da consulta
     */
    public Horario(String hora) {
        this.hora = hora;
    }

    /**
     * Pega o id do horário
     *
     * @return int identificador do horário
     */
    public int getIdhorario() {
        return idhorario;
    }

    /**
     *
     * @param idhorario responsável por atribuir o valor a variável
     * identificador do horário
     */
    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
    }

    /**
     * Pega o horário horário
     *
     * @return String horário
     */
    public String getHora() {
        return hora;
    }

    /**
     * Construtor da classe
     *
     * @param hora 
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Pega o nome do médico
     *
     * @return String nome do médico
     */
    public String getNomeMedico() {
        return nomeMedico;
    }

    /**
     *
     * @param nomeMedico responsável por atribuir o valor a variável nome do
     * médico
     */
    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

}
