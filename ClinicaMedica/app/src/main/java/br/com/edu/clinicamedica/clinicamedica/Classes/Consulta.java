package br.com.edu.clinicamedica.clinicamedica.Classes;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by higor on 08/02/17.
 */

public class Consulta implements Serializable{
    private int idAgendamento;
    private String dataConsulta;
    private String horario;
    private  String status;
    private String observacoes;
    private String nomeMed;
    private String nomePac;
    private String busca;

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

    public Consulta(int idAgendamento, String dataConsulta, String horario, String status, String observacoes, String nomePac, String nomeMed) {
        this.idAgendamento = idAgendamento;
        this.dataConsulta = dataConsulta;
        this.horario = horario;
        this.status = status;
        this.observacoes = observacoes;
        this.nomePac = nomePac;
        this.nomeMed = nomeMed;
    }

    public Consulta() {
    }

    public String getNomeMed() {
        return nomeMed;
    }

    public void setNomeMed(String nomeMed) {
        this.nomeMed = nomeMed;
    }

    public String getNomePac() {
        return nomePac;
    }

    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }



    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }



    public Consulta(String dataConsulta, String horario, String status, String observacoes, String nomeMed, String nomePac) {
        this.dataConsulta = dataConsulta;
        this.horario = horario;
        this.status = status;
        this.observacoes = observacoes;
        this.nomeMed = nomeMed;
        this.nomePac = nomePac;
    }
}
