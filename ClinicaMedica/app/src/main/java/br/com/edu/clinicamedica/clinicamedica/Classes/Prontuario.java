package br.com.edu.clinicamedica.clinicamedica.Classes;
import java.io.Serializable;

/**
 * Created by higor on 08/02/17.
 */

public class Prontuario implements Serializable {
    private int idProntuario;
    private String medicamento;
    private String resultado;
    private String posologia;
    private int idConsulta;

    public Prontuario() {
    }

    public int getIdProntuario() {
        return idProntuario;
    }

    public void setIdProntuario(int idProntuario) {
        this.idProntuario = idProntuario;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Prontuario(int idProntuario, String medicamento, String resultado, String posologia) {

        this.idProntuario = idProntuario;
        this.medicamento = medicamento;
        this.resultado = resultado;
        this.posologia = posologia;
    }
}
