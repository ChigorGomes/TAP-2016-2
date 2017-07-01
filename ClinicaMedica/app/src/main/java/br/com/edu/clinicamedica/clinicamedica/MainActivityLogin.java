package br.com.edu.clinicamedica.clinicamedica;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.edu.clinicamedica.clinicamedica.BancoDeDados.ConexaoBD;
import br.com.edu.clinicamedica.clinicamedica.Classes.Usuario;
import br.com.edu.clinicamedica.clinicamedica.ClassesDAO.UsuarioDAO;


public class MainActivityLogin extends AppCompatActivity {

    private ConexaoBD bd;
    private SQLiteDatabase con;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        try {
            bd= new ConexaoBD(this);
            con= bd.getReadableDatabase();
            AlertDialog.Builder dig=  new AlertDialog.Builder(this);
            dig.setMessage("Conexão realizada com sucesso!");
            dig.setNeutralButton("OK",null);
            dig.show();
        }catch (SQLiteException e){
            AlertDialog.Builder dig=  new AlertDialog.Builder(this);
            dig.setMessage("Conexão não realizada!");
            dig.setNeutralButton("OK",null);
            dig.show();

        }


    }

    public void entrarPrincipal(View view){
        Intent intent= new Intent(this,MainActivityPrincipal.class);


        EditText inputLogin= (EditText) findViewById(R.id.editTextLogin);
        EditText inputSenha= (EditText) findViewById(R.id.editTextNomeUsuario);

        UsuarioDAO usuarioDAO= new UsuarioDAO(this);
        Usuario usuario= usuarioDAO.getUsuario(inputLogin.getText().toString(),inputSenha.getText().toString());

        if(usuario!=null){
            intent.putExtra("usuario",usuario);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Usuário e/ou Senha inválidos",Toast.LENGTH_SHORT).show();
        }
    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }







}
