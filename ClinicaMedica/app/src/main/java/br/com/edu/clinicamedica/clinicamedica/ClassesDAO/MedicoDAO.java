package br.com.edu.clinicamedica.clinicamedica.ClassesDAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

import java.util.Vector;

import br.com.edu.clinicamedica.clinicamedica.BancoDeDados.ConexaoBD;
import br.com.edu.clinicamedica.clinicamedica.Classes.Medico;
import br.com.edu.clinicamedica.clinicamedica.Classes.Usuario;


/**
 * Created by higor on 09/02/17.
 */

public class MedicoDAO {

    private SQLiteDatabase bd;

    public MedicoDAO(Context context) {
        this.bd = (new ConexaoBD(context)).getWritableDatabase();
    }

    public boolean addMedico(Medico medico) {
        try {
            String sql = "INSERT INTO MEDICO VALUES(NULL,'" + medico.getNomeMedico() + "','" + medico.getEspecialidade() + "','" + medico.getCrm() + "')";
            this.bd.execSQL(sql);
            return true;
        } catch (SQLiteException e) {
            Log.e("Erro ao inserir", e.getMessage());
            return false;
        }


    }

    public boolean deletar(String busca) {
        try {
            String sql = "SELECT * FROM medico WHERE nomemedico='" + busca + "'";
            Cursor cursor = this.bd.rawQuery(sql, null);
            if (cursor.moveToFirst()) {
                this.bd.execSQL("DELETE FROM MEDICO WHERE nomemedico='" + busca + "'");
                return true;
            }
        } catch (SQLiteException e) {
            Log.e("Erro ao excluir!", e.getMessage());
            return false;
        }
        return false;
    }

    public boolean editar(Medico medico) {
        try {

            this.bd.execSQL("UPDATE medico SET nomemedico='" + medico.getNomeMedico() + "' , CRM='" + medico.getCrm() + "' ");
            return true;

        } catch (SQLiteException ex) {
            Log.e("Erro ao editar!", ex.getMessage());
            return false;
        }


    }

    public boolean buscar(Medico medico) {

        try {
            String sql = "SELECT * FROM medico WHERE nomemedico LIKE'%" + medico.getBusca() + "%'";
            Cursor cursor = this.bd.rawQuery(sql, null);
            if (cursor.moveToFirst()) {
                medico.setNomeMedico(cursor.getString(1));
                medico.setEspecialidade(cursor.getString(2));
                medico.setCrm(cursor.getString(3));
                return true;
            }
        } catch (SQLiteException ex) {
            Log.e("Erro ao buscar!", ex.getMessage());
            return false;
        }
        return false;
    }

    public Vector<Medico> mostraTodos() {
        Vector listaNomes = new Vector();
        try {

            String sql = "SELECT * FROM MEDICO ORDER BY nomemedico";
            Cursor cursor = this.bd.rawQuery(sql, null);
            while (cursor.moveToNext()) {
                int codigo = cursor.getInt(0);
                String nome = cursor.getString(1);
                Medico medico = new Medico(codigo, nome);
                listaNomes.add(medico);
            }
            return listaNomes;
        } catch (SQLiteException ex) {
            Log.e("Erro", ex.getMessage());
        }
        return listaNomes;
    }
}