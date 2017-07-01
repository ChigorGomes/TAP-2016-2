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
import br.com.edu.clinicamedica.clinicamedica.Classes.Paciente;
import br.com.edu.clinicamedica.clinicamedica.Classes.Usuario;
import br.com.edu.clinicamedica.clinicamedica.ClassesDAO.MedicoDAO;
import br.com.edu.clinicamedica.clinicamedica.ClassesDAO.PacienteDAO;

public class MainActivityCadastraPaciente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cadastra_paciente);
        Intent intent= getIntent();
        Usuario usuario= (Usuario) intent.getSerializableExtra("usuario");
        Button buttonExcluir = (Button) findViewById(R.id.buttonExcluiPaciente);
        Button buttonEditar = (Button) findViewById(R.id.buttonAlteraPaciente);
        buttonExcluir.setEnabled(false);
        buttonEditar.setEnabled(false);
    }

    public void cadastrarPaciente(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomePaciente);
        EditText inputNascimento= (EditText) findViewById(R.id.editTextNascimentoPaciente);
        EditText inputTtelefone= (EditText) findViewById(R.id.editTextTelefonePaciente);

        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }else if(inputNascimento.getText().toString().equals("")){
            Toast.makeText(this,"Informe o Nascimento!",Toast.LENGTH_SHORT).show();
        }else if(inputTtelefone.getText().toString().equals("")){
            Toast.makeText(this,"Informe o Telefone!",Toast.LENGTH_SHORT).show();
        }else {
            Paciente paciente= new Paciente(inputNome.getText().toString(),inputNascimento.getText().toString(),inputTtelefone.getText().toString());
            PacienteDAO pacienteDAO= new PacienteDAO(this);
            if(pacienteDAO.addPaciente(paciente)){
                Toast.makeText(this,"Paciente Cadastrado!",Toast.LENGTH_SHORT).show();
                finish();
            }else{
                Toast.makeText(this,"Erro ao cadastrar!",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void excluirPaciente(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomePaciente);
        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }
        PacienteDAO pacienteDAO= new PacienteDAO(this);
        boolean aux= pacienteDAO.deletar(inputNome.getText().toString());
        if(aux){
            Toast.makeText(this,"Excluido com sucesso!",Toast.LENGTH_SHORT).show();
            finish();

        }else{
            Toast.makeText(this,"Médico não encontrado!",Toast.LENGTH_SHORT).show();

        }


    }

    public  void editar(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomePaciente);
        EditText inputNascimento= (EditText) findViewById(R.id.editTextNascimentoPaciente);
        EditText inputCelular= (EditText) findViewById(R.id.editTextTelefonePaciente);

        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }
        Paciente paciente= new Paciente(inputNome.getText().toString(),inputNascimento.getText().toString(),inputCelular.getText().toString());

       PacienteDAO pacienteDAO = new PacienteDAO(this);

        boolean aux=pacienteDAO.editar(paciente);
        if(aux){
            Toast.makeText(this,"Editado com sucesso!",Toast.LENGTH_SHORT).show();
            finish();

        }else{
            Toast.makeText(this,"Erro ao editar!",Toast.LENGTH_SHORT).show();

        }

    }

    public void buscar(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomePaciente);
        EditText inputNascimento= (EditText) findViewById(R.id.editTextNascimentoPaciente);
        EditText inputCelular= (EditText) findViewById(R.id.editTextTelefonePaciente);


        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }else{
            PacienteDAO pacienteDAO= new PacienteDAO(this);
            Paciente paciente= new Paciente();
            paciente.setBusca(inputNome.getText().toString());


            boolean aux= pacienteDAO.buscar(paciente);
            if(aux){
                inputNascimento.setEnabled(false);
                inputNome.setText(paciente.getNomePaciente());
                inputCelular.setText(paciente.getCelular());
                inputNascimento.setText(paciente.getNascimento());


                Button buttonExcluir = (Button) findViewById(R.id.buttonExcluiPaciente);
                Button buttonEditar = (Button) findViewById(R.id.buttonAlteraPaciente);
                buttonExcluir.setEnabled(true);
                buttonEditar.setEnabled(true);



            }else{
                Toast.makeText(this,"Não encontrado!",Toast.LENGTH_SHORT).show();

            }
        }
    }

}
