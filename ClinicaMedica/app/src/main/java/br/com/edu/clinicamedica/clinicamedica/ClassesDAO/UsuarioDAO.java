package br.com.edu.clinicamedica.clinicamedica.ClassesDAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

import java.util.Vector;

import br.com.edu.clinicamedica.clinicamedica.BancoDeDados.ConexaoBD;
import br.com.edu.clinicamedica.clinicamedica.Classes.Usuario;

/**
 * Created by higor on 08/02/17.
 */

public class UsuarioDAO {
    private SQLiteDatabase bd;

    public UsuarioDAO(Context context) {
        this.bd = (new ConexaoBD(context)).getWritableDatabase();
    }

    public boolean addUsuario(Usuario usu) {
        try {
            String sql = "INSERT INTO USUARIO VALUES(NULL,'" + usu.getNome() + "','" + usu.getUsuario() + "','" + usu.getSenha() + "','" + usu.getTipoUsuario() + "')";
            this.bd.execSQL(sql);
            return true;
        } catch (SQLiteException e) {
            Log.e("Erro ao inserir", e.getMessage());
            return false;
        }


    }

    public Usuario getUsuario(String login, String senha) {
        Usuario usuario = null;

        String sql = "SELECT * FROM Usuario WHERE " + "usuario='" + login + "' AND senha='" + senha + "'";
        Cursor cursor = this.bd.rawQuery(sql, null);

        if (cursor.moveToNext()) {
            usuario = new Usuario(cursor.getString(0), cursor.getString(1),
                    cursor.getString(2), cursor.getString(3));
        }
        cursor.close();
        return usuario;
    }

    public boolean deletar(String busca) {
        try {
            String sql = "SELECT * FROM USUARIO WHERE nome='" + busca + "'";
            Cursor cursor = this.bd.rawQuery(sql, null);
            if (cursor.moveToFirst()) {
                this.bd.execSQL("DELETE FROM USUARIO WHERE nome='" + busca + "'");
                return true;
            }
        } catch (SQLiteException e) {
            Log.e("Erro ao excluir!", e.getMessage());
            return false;
        }
        return false;
    }

    public boolean editar(Usuario usuario){
        try {

                this.bd.execSQL("UPDATE USUARIO SET nome='" + usuario.getNome() + "' , USUARIO='" + usuario.getUsuario() + "' , SENHA='" + usuario.getSenha()+ "'");
                return  true;

        }catch (SQLiteException ex){
            Log.e("Erro ao editar!", ex.getMessage());
            return false;
        }

    }

    public boolean buscar(Usuario usuario){

        try {
            String sql="SELECT * FROM USUARIO WHERE nome LIKE'%"+usuario.getBusca()+"%'";
            Cursor cursor= this.bd.rawQuery(sql,null);
            if(cursor.moveToFirst()){
                usuario.setNome(cursor.getString(1));
                usuario.setUsuario(cursor.getString(2));
                usuario.setSenha(cursor.getString(3));
                usuario.setTipoUsuario(cursor.getString(4));
                return  true;
            }
        }catch (SQLiteException ex){
            Log.e("Erro ao buscar!", ex.getMessage());
            return false;
        }
        return false;
    }

}