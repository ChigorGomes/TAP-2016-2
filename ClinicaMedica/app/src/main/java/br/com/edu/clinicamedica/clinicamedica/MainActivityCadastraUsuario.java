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

import br.com.edu.clinicamedica.clinicamedica.Classes.Usuario;
import br.com.edu.clinicamedica.clinicamedica.ClassesDAO.UsuarioDAO;

public class MainActivityCadastraUsuario extends AppCompatActivity {



    String item;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cadastra_usuario);
        Intent intent= getIntent();

        Usuario usuario= (Usuario) intent.getSerializableExtra("usuario");

        final Spinner tipoUsuario=(Spinner)findViewById(R.id.spinnerTipoUser);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(this,R.array.tipoUsuario,R.layout.support_simple_spinner_dropdown_item);

        tipoUsuario.setAdapter(adapter);
        item= tipoUsuario.getSelectedItem().toString();
        Button buttonExcluir = (Button) findViewById(R.id.buttonExcluirUsuario);
        Button buttonEditar = (Button) findViewById(R.id.buttonEditarUsuario);
        buttonExcluir.setEnabled(false);
        buttonEditar.setEnabled(false);

    }

    public void cadastrarUsuario(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomeUsuario);
        EditText inputUsuario= (EditText) findViewById(R.id.editTextUsuario);
        EditText inputSenha= (EditText) findViewById(R.id.editTextPass);


        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }else if(inputUsuario.getText().toString().equals("")){
            Toast.makeText(this,"Informe o usuário!",Toast.LENGTH_SHORT).show();
        }else if(inputSenha.getText().toString().equals("")) {
            Toast.makeText(this, "Informe a senha!", Toast.LENGTH_SHORT).show();
        }else{
            Usuario usu= new Usuario(inputNome.getText().toString(),inputUsuario.getText().toString(),inputSenha.getText().toString(),item);
            UsuarioDAO usuarioDAO= new UsuarioDAO(this);
            if(usuarioDAO.addUsuario(usu)){
                Toast.makeText(this,"Usuário criado!",Toast.LENGTH_SHORT).show();
                finish();
            }else{
                Toast.makeText(this,"Erro ao cadastrar!",Toast.LENGTH_SHORT).show();
            }
        }
        }

    public void excluirUsuario(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomeUsuario);
        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }
        UsuarioDAO usuarioDAO= new UsuarioDAO(this);
       boolean aux= usuarioDAO.deletar(inputNome.getText().toString());
        if(aux){
            Toast.makeText(this,"Excluido com sucesso!",Toast.LENGTH_SHORT).show();
            finish();

        }else{
            Toast.makeText(this,"Usuário não encontrado!",Toast.LENGTH_SHORT).show();

        }


    }

    public  void editar(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomeUsuario);
        EditText inputUsuario= (EditText) findViewById(R.id.editTextUsuario);
        EditText inputSenha= (EditText) findViewById(R.id.editTextPass);
        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }
        Usuario usu= new Usuario(inputNome.getText().toString(),inputUsuario.getText().toString(),inputSenha.getText().toString(),item);

        UsuarioDAO usuarioDAO= new UsuarioDAO(this);
        boolean aux=usuarioDAO.editar(usu);
        if(aux){
            Toast.makeText(this,"Editado com sucesso!",Toast.LENGTH_SHORT).show();
            finish();

        }else{
            Toast.makeText(this,"Erro ao editar!",Toast.LENGTH_SHORT).show();

        }

    }

    public void buscar(View view){
        EditText inputNome= (EditText) findViewById(R.id.editTextNomeUsuario);
        EditText inputUsuario= (EditText) findViewById(R.id.editTextUsuario);
        EditText inputSenha= (EditText) findViewById(R.id.editTextPass);
        final Spinner tipoUsuario=(Spinner)findViewById(R.id.spinnerTipoUser);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(this,R.array.tipoUsuario,R.layout.support_simple_spinner_dropdown_item);

        tipoUsuario.setAdapter(adapter);
        if(inputNome.getText().toString().equals("")){
            Toast.makeText(this,"Informe o nome!",Toast.LENGTH_SHORT).show();
        }else{
            UsuarioDAO usuarioDAO= new UsuarioDAO(this);
            Usuario usuario= new Usuario();
            usuario.setBusca(inputNome.getText().toString());
            boolean aux= usuarioDAO.buscar(usuario);
            if(aux){
                inputNome.setText(usuario.getNome());
                inputSenha.setText(usuario.getSenha());
                inputUsuario.setText(usuario.getUsuario());
                tipoUsuario.setEnabled(false);

                Button buttonExcluir = (Button) findViewById(R.id.buttonExcluirUsuario);
                Button buttonEditar = (Button) findViewById(R.id.buttonEditarUsuario);
                buttonExcluir.setEnabled(true);
                buttonEditar.setEnabled(true);



            }else{
                Toast.makeText(this,"Não encontrado!",Toast.LENGTH_SHORT).show();

            }
        }
        }


}
