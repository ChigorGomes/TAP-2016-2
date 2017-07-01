package br.com.edu.clinicamedica.clinicamedica.Classes;

import java.io.Serializable;

/**
 * Created by higor on 08/02/17.
 */

public class HorarioConsulta implements Serializable {
    private int idHorario;
    private String hora;
    private int idConsulta;

    public HorarioConsulta() {
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public HorarioConsulta(int idHorario, String hora) {

        this.idHorario = idHorario;
        this.hora = hora;
    }
}
