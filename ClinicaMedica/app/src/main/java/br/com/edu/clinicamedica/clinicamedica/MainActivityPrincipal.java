package br.com.edu.clinicamedica.clinicamedica;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.edu.clinicamedica.clinicamedica.Classes.Usuario;
import br.com.edu.clinicamedica.clinicamedica.ClassesDAO.UsuarioDAO;

public class MainActivityPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);

        Intent intent= getIntent();

        Usuario usuario= (Usuario) intent.getSerializableExtra("usuario");
    }




    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.sair:
                AlertDialog.Builder alert= new AlertDialog.Builder(this);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void acessaCadastraUsuario(View view){
        Intent intent= new Intent(this,MainActivityCadastraUsuario.class);
        startActivity(intent);
    }

    public void acessaCadastraMedico(View view){
        Intent intent= new Intent(this,MainActivityCadastraMedico.class);
        startActivity(intent);
    }

    public void acessaCadastraPaciente(View view){
        Intent intent= new Intent(this,MainActivityCadastraPaciente.class);
        startActivity(intent);
    }

    public void acessaCadastraConsulta(View view){
        Intent intent= new Intent(this,MainActivityCadastraConsulta.class);
        startActivity(intent);
    }

    public void acessaConsultas(View view){
        Intent intent= new Intent(this,MainActivityAtendimentos.class);
        startActivity(intent);
    }






}
