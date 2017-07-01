package br.com.edu.clinicamedica.clinicamedica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.edu.clinicamedica.clinicamedica.Classes.Consulta;
import br.com.edu.clinicamedica.clinicamedica.Classes.Medico;
import br.com.edu.clinicamedica.clinicamedica.Classes.Paciente;
import br.com.edu.clinicamedica.clinicamedica.Classes.Usuario;
import br.com.edu.clinicamedica.clinicamedica.ClassesDAO.ConsultaDAO;
import br.com.edu.clinicamedica.clinicamedica.ClassesDAO.MedicoDAO;
import br.com.edu.clinicamedica.clinicamedica.ClassesDAO.PacienteDAO;

public class MainActivityCadastraConsulta extends AppCompatActivity {
int idMedico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cadastra_consulta);
        Intent intent= getIntent();

        Usuario usuario= (Usuario) intent.getSerializableExtra("usuario");

        /* MedicoDAO medicoDAO= new MedicoDAO(this);
        nomes= medicoDAO.mostraTodos();
        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.simple_spinner_item,nomes);
        nomeMedico = (Spinner)findViewById(R.id.spinnerMedicoConsulta);
        nomeMedico.setAdapter(adapter);*/
    }
    public void buscarPaciente(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomePacienteConsulta);


        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!", Toast.LENGTH_SHORT).show();
        }else{
            PacienteDAO pacienteDAO= new PacienteDAO(this);
            Paciente paciente= new Paciente();
            paciente.setBusca(inputNome.getText().toString());


            boolean aux= pacienteDAO.buscar(paciente);
            if(aux){

                inputNome.setText(paciente.getNomePaciente());

            }else{
                Toast.makeText(this,"Não encontrado!",Toast.LENGTH_SHORT).show();

            }
        }
    }

    public void buscarMedico(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomeMedicoConsulta);
        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }else{
            MedicoDAO medicoDAO= new MedicoDAO(this);
            Medico medico= new Medico();
            medico.setBusca(inputNome.getText().toString());

            boolean aux= medicoDAO.buscar(medico);
            if(aux){
                inputNome.setText(medico.getNomeMedico());

            }else{
                Toast.makeText(this,"Não encontrado!",Toast.LENGTH_SHORT).show();

            }
        }
    }



    public void cadastrarConsulta(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomePacienteConsulta);
        EditText inputData= (EditText) findViewById(R.id.editTextDataConsulta);
        EditText inputHorario= (EditText) findViewById(R.id.editTextHorarioConsulta);
        EditText inputObs= (EditText) findViewById(R.id.editTextObs);
        EditText inputNomeMedico= (EditText) findViewById(R.id.editTextNomeMedicoConsulta);

        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }else if(inputHorario.getText().toString().equals("")){
            Toast.makeText(this,"Informe o horário!",Toast.LENGTH_SHORT).show();
        }else if(inputData.getText().toString().equals("")){
            Toast.makeText(this,"Informe a data!",Toast.LENGTH_SHORT).show();
        }else if(inputNomeMedico.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome do médico!",Toast.LENGTH_SHORT).show();
        }else if(inputObs.getText().toString().equals("")){
            Toast.makeText(this,"Informe o observação!",Toast.LENGTH_SHORT).show();
        }
        else{

            Consulta consulta= new Consulta(inputData.getText().toString(),inputHorario.getText().toString(),"Aberto",inputObs.getText().toString(),inputNomeMedico.getText().toString(),inputNome.getText().toString());
            ConsultaDAO consultaDAO= new ConsultaDAO(this);
            boolean aux= consultaDAO.salvar(consulta);
            if(aux){
                Toast.makeText(this,"Consultada Cadastrada!",Toast.LENGTH_SHORT).show();
                finish();
            }else{
                Toast.makeText(this,"Erro ao cadastrar!",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public  void cancela(View view){
        finish();
    }

}
