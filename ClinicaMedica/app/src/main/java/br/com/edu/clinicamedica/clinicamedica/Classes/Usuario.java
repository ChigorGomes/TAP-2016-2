package br.com.edu.clinicamedica.clinicamedica.Classes;
import java.io.Serializable;
/**
 * Created by higor on 08/02/17.
 */

public class Usuario implements Serializable {
    private int idUsuario;
    private String nome;
    private String usuario;
    private String senha;
    private  String tipoUsuario;
    private String busca;

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Usuario(String nome, String tipoUsuario) {
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario(String nome, String usuario, String senha, String tipoUsuario) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }
}
