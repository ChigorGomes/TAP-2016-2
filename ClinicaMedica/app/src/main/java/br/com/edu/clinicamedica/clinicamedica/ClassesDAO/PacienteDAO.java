package br.com.edu.clinicamedica.clinicamedica.ClassesDAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

import br.com.edu.clinicamedica.clinicamedica.BancoDeDados.ConexaoBD;
import br.com.edu.clinicamedica.clinicamedica.Classes.Medico;
import br.com.edu.clinicamedica.clinicamedica.Classes.Paciente;

/**
 * Created by higor on 09/02/17.
 */

public class PacienteDAO {


    private SQLiteDatabase bd;

    public PacienteDAO(Context context) {
        this.bd = (new ConexaoBD(context)).getWritableDatabase();
    }

    public boolean addPaciente(Paciente paciente) {
        try {
            String sql = "INSERT INTO PACIENTE VALUES(NULL,'" + paciente.getNomePaciente() + "','" + paciente.getNascimento() + "','" + paciente.getCelular()+ "')" ;
            this.bd.execSQL(sql);
            return true;
        } catch (SQLiteException e) {
            Log.e("Erro ao inserir", e.getMessage());
            return false;
        }


    }

    public boolean deletar(String busca) {
        try {
            String sql = "SELECT * FROM PACIENTE WHERE nomepaciente='" + busca + "'";
            Cursor cursor = this.bd.rawQuery(sql, null);
            if (cursor.moveToFirst()) {
                this.bd.execSQL("DELETE FROM PACIENTE WHERE nomepaciente='" + busca + "'");
                return true;
            }
        } catch (SQLiteException e) {
            Log.e("Erro ao excluir!", e.getMessage());
            return false;
        }
        return false;
    }

    public boolean editar(Paciente paciente){
        try {

            this.bd.execSQL("UPDATE PACIENTE SET nomepaciente='" + paciente.getNomePaciente() + "' , NASCIMENTO='" + paciente.getNascimento() + "',CELULAR=' "+paciente.getCelular()+"'");
            return  true;

        }catch (SQLiteException ex){
            Log.e("Erro ao editar!", ex.getMessage());
            return false;
        }


    }

    public boolean buscar(Paciente paciente){

        try {
            String sql="SELECT * FROM   PACIENTE WHERE nomepaciente LIKE'%"+paciente.getBusca()+"%'";
            Cursor cursor= this.bd.rawQuery(sql,null);
            if(cursor.moveToFirst()){
                paciente.setNomePaciente(cursor.getString(1));
                paciente.setNascimento(cursor.getString(2));
                paciente.setCelular(cursor.getString(3));
                return  true;
            }
        }catch (SQLiteException ex){
            Log.e("Erro ao buscar!", ex.getMessage());
            return false;
        }
        return false;
    }
}
