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

import br.com.edu.clinicamedica.clinicamedica.Classes.Consulta;
import br.com.edu.clinicamedica.clinicamedica.Classes.Medico;
import br.com.edu.clinicamedica.clinicamedica.Classes.Usuario;
import br.com.edu.clinicamedica.clinicamedica.ClassesDAO.ConsultaDAO;
import br.com.edu.clinicamedica.clinicamedica.ClassesDAO.MedicoDAO;

public class MainActivityAtendimentos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_atendimentos);
        Intent intent= getIntent();

        Usuario usuario= (Usuario) intent.getSerializableExtra("usuario");

    }

    public void buscar(View view){
        EditText inputNomePaciente= (EditText) findViewById(R.id.editTextPacienteAt);
        EditText inputHorario=(EditText) findViewById(R.id.editTextHorarioAt) ;
        EditText inputNomeMedico=(EditText) findViewById(R.id.editTextMedicoAt);
        EditText inputData =(EditText) findViewById(R.id.editTextDataAt);
        EditText inputObs= (EditText) findViewById(R.id.editTextObsAt);
        if(inputHorario.getText().toString().equals("")){
            Toast.makeText(this,"Informe o Horário!",Toast.LENGTH_SHORT).show();
        }else{
            ConsultaDAO consultaDAO= new ConsultaDAO(this);
            Consulta consulta= new Consulta();
            consulta.setBusca(inputHorario.getText().toString());

            boolean aux= consultaDAO.buscarConsulta(consulta);
            if(aux){
                inputData.setEnabled(false);
                inputNomeMedico.setEnabled(false);
                inputNomePaciente.setEnabled(false);
                inputObs.setEnabled(false);


                inputNomeMedico.setText(consulta.getNomeMed());
                inputNomePaciente.setText(consulta.getNomePac());
                inputData.setText(consulta.getDataConsulta());
                inputObs.setText(consulta.getObservacoes());
                inputHorario.setText(consulta.getHorario());

            }else{
                Toast.makeText(this,"Não encontrado!",Toast.LENGTH_SHORT).show();

            }
        }
    }
}
