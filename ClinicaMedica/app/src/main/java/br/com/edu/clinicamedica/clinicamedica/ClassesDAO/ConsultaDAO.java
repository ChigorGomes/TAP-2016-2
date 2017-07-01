package br.com.edu.clinicamedica.clinicamedica.ClassesDAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

import java.util.Vector;

import br.com.edu.clinicamedica.clinicamedica.BancoDeDados.ConexaoBD;
import br.com.edu.clinicamedica.clinicamedica.Classes.Consulta;
import br.com.edu.clinicamedica.clinicamedica.Classes.Medico;
import br.com.edu.clinicamedica.clinicamedica.Classes.Usuario;
import br.com.edu.clinicamedica.clinicamedica.MainActivityCadastraConsulta;

/**
 * Created by higor on 09/02/17.
 */

public class ConsultaDAO {
    private SQLiteDatabase bd;
    int idMedico;
    int idPaciente;

    public ConsultaDAO(Context context) {
        this.bd = (new ConexaoBD(context)).getWritableDatabase();
    }


    public boolean buscaMedico(String busca){

        try {
            String sql="SELECT * FROM MEDICO WHERE nomemedico='"+busca+"'";
            Cursor cursor= this.bd.rawQuery(sql,null);
            if(cursor.moveToFirst()){
                idMedico= cursor.getInt(0);
                return  true;
            }
        }catch (SQLiteException ex){
            Log.e("Erro ao buscar!", ex.getMessage());
            return false;
        }
        return false;

    }
    public boolean buscaPaciente(String busca){

        try {
            String sql="SELECT * FROM Paciente WHERE nomepaciente='"+busca+"'";
            Cursor cursor= this.bd.rawQuery(sql,null);
            if(cursor.moveToFirst()){
                idPaciente= cursor.getInt(0);
                return  true;
            }
        }catch (SQLiteException ex){
            Log.e("Erro ao buscar!", ex.getMessage());
            return false;
        }
        return false;

    }

    public boolean salvar(Consulta consulta){
        buscaMedico(consulta.getNomeMed());
        buscaPaciente(consulta.getNomePac());
        try {
            String sql = "INSERT INTO AGENDAMENTO VALUES(NULL," + idMedico + "," + idPaciente + ", '" + consulta.getDataConsulta() + "', '" + consulta.getHorario() + "', '" + consulta.getStatus() + "', '" + consulta.getObservacoes() + "')";
            this.bd.execSQL(sql);
            return true;
        } catch (SQLiteException e) {
            Log.e("Erro ao inserir", e.getMessage());
            return false;
        }
    }
    public boolean buscarConsulta(Consulta consulta) {

        try {
            String sql="SELECT * FROM AGENDAMENTO inner join  paciente on agendamento.idpaciente= paciente.idpaciente inner join medico on agendamento.idmedico=medico.idmedico where  horario like '%"+consulta.getBusca()+"%'";
            Cursor cursor = this.bd.rawQuery(sql, null);
            if (cursor.moveToFirst()) {
                consulta.setNomeMed(cursor.getString(1));
                consulta.setNomePac(cursor.getString(2));
                consulta.setHorario(cursor.getString(4));
                consulta.setObservacoes(cursor.getString(6));
                consulta.setDataConsulta(cursor.getString(3));
                return true;
            }
        } catch (SQLiteException ex) {
            Log.e("Erro ao buscar!", ex.getMessage());
            return false;
        }
        return false;
    }






}
