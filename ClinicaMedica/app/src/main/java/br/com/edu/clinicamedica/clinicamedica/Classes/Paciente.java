package br.com.edu.clinicamedica.clinicamedica.Classes;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by higor on 08/02/17.
 */

public class Paciente implements Serializable {
    private  int idPaciente;
    private String nomePaciente;
    private String nascimento;
    private String celular;
    private String busca;

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

    public Paciente() {
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }



    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Paciente(String nomePaciente, String nascimento, String celular) {
        this.nomePaciente = nomePaciente;
        this.nascimento = nascimento;
        this.celular = celular;
    }
}
