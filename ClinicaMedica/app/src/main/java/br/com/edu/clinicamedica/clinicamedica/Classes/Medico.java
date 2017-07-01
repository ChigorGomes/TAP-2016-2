package br.com.edu.clinicamedica.clinicamedica.Classes;

import java.io.Serializable;

/**
 * Created by higor on 08/02/17.
 */

public class Medico implements Serializable {
    private int idMedico;
    private String nomeMedico;
    private String especialidade;
    private int codLaudo;
    private String crm;
    private String busca;

    public Medico(int idMedico, String nomeMedico) {
        this.idMedico = idMedico;
        this.nomeMedico = nomeMedico;
    }

    public Medico(String nomeMedico, String crm) {
        this.nomeMedico = nomeMedico;
        this.crm = crm;
    }

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

    public Medico(String nomeMedico, String especialidade, String crm) {
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Medico() {
    }

    public int getIdMedico() {

        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCodLaudo() {
        return codLaudo;
    }

    public void setCodLaudo(int codLaudo) {
        this.codLaudo = codLaudo;
    }

    @Override
    public String toString() {
        return nomeMedico;
    }
}
