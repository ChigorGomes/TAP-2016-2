package br.com.edu.clinicamedica.clinicamedica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import br.com.edu.clinicamedica.clinicamedica.Classes.Medico;
import br.com.edu.clinicamedica.clinicamedica.Classes.Usuario;
import br.com.edu.clinicamedica.clinicamedica.ClassesDAO.MedicoDAO;
import br.com.edu.clinicamedica.clinicamedica.ClassesDAO.UsuarioDAO;

public class MainActivityCadastraMedico extends AppCompatActivity {
String item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cadastra_medico);
        Intent intent= getIntent();

        Usuario usuario= (Usuario) intent.getSerializableExtra("usuario");

        final Spinner especialidade=(Spinner)findViewById(R.id.spinnerEspecialidade);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(this,R.array.EspecidalidadeMedica,R.layout.support_simple_spinner_dropdown_item);

        especialidade.setAdapter(adapter);
        item= especialidade.getSelectedItem().toString();
        Button buttonExcluir = (Button) findViewById(R.id.buttonExcluiMedico);
        Button buttonEditar = (Button) findViewById(R.id.buttonEditaMedico);
        buttonExcluir.setEnabled(false);
        buttonEditar.setEnabled(false);
    }

    public void cadastrarMedico(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomeMedico);
        EditText inputcrm= (EditText) findViewById(R.id.editTextCrmMedico);

        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }else if(inputcrm.getText().toString().equals("")){
            Toast.makeText(this,"Informe o crm!",Toast.LENGTH_SHORT).show();
        }else{
            Medico medico= new Medico(inputNome.getText().toString(),item,inputcrm.getText().toString());
            MedicoDAO medicoDAO= new MedicoDAO(this);
            if(medicoDAO.addMedico(medico)){
                Toast.makeText(this,"Médico Cadastrado!",Toast.LENGTH_SHORT).show();
                finish();
            }else{
                Toast.makeText(this,"Erro ao cadastrar!",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void excluirMedico(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomeMedico);
        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }
        MedicoDAO medicoDAO= new MedicoDAO(this);
        boolean aux= medicoDAO.deletar(inputNome.getText().toString());
        if(aux){
            Toast.makeText(this,"Excluido com sucesso!",Toast.LENGTH_SHORT).show();
            finish();

        }else{
            Toast.makeText(this,"Médico não encontrado!",Toast.LENGTH_SHORT).show();

        }


    }

    public  void editar(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomeMedico);
        EditText inputCrm= (EditText) findViewById(R.id.editTextCrmMedico);
        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }
        Medico medico= new Medico(inputNome.getText().toString(),inputCrm.getText().toString());
        MedicoDAO medicoDAO= new MedicoDAO(this);

        boolean aux=medicoDAO.editar(medico);
        if(aux){
            Toast.makeText(this,"Editado com sucesso!",Toast.LENGTH_SHORT).show();
            finish();

        }else{
            Toast.makeText(this,"Erro ao editar!",Toast.LENGTH_SHORT).show();

        }

    }

    public void buscar(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomeMedico);
        EditText inputCrm= (EditText) findViewById(R.id.editTextCrmMedico);

        final Spinner especialidade=(Spinner)findViewById(R.id.spinnerEspecialidade);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(this,R.array.EspecidalidadeMedica,R.layout.support_simple_spinner_dropdown_item);

        especialidade.setAdapter(adapter);
        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }else{
            MedicoDAO medicoDAO= new MedicoDAO(this);
            Medico medico= new Medico();
            medico.setBusca(inputNome.getText().toString());

            boolean aux= medicoDAO.buscar(medico);
            if(aux){
                inputCrm.setEnabled(false);
                inputNome.setText(medico.getNomeMedico());
                inputCrm.setText(medico.getCrm());

                especialidade.setEnabled(false);

                Button buttonExcluir = (Button) findViewById(R.id.buttonExcluiMedico);
                Button buttonEditar = (Button) findViewById(R.id.buttonEditaMedico);
                buttonExcluir.setEnabled(true);
                buttonEditar.setEnabled(true);



            }else{
                Toast.makeText(this,"Não encontrado!",Toast.LENGTH_SHORT).show();

            }
        }
    }

}
