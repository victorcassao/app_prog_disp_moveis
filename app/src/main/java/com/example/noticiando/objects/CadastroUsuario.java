package com.example.noticiando.objects;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.noticiando.LoginActivity;
import com.example.noticiando.R;
import com.example.noticiando.database.BancoController;

public class CadastroUsuario extends AppCompatActivity {

    BancoController bancoController = new BancoController(this);

    EditText usuario_cadastro_nome;
    EditText usuario_cadastro_login;
    EditText usuario_cadastro_senha;
    Button  botao_cadastro_usuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        botao_cadastro_usuario = findViewById(R.id.botao_cadastro_usuario);
        

        botao_cadastro_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                usuario_cadastro_nome = findViewById(R.id.usuario_cadastro_nome);
                usuario_cadastro_login = findViewById(R.id.usuario_cadastro_login);
                usuario_cadastro_senha = findViewById(R.id.usuario_cadastro_senha);

                usuario_cadastro_nome.getText().toString();
                usuario_cadastro_login.getText().toString();
                usuario_cadastro_senha.getText().toString();

                try {
                    bancoController.insereDadoUsuario(new Usuario(usuario_cadastro_nome.getText().toString(),
                                                                  usuario_cadastro_login.getText().toString(),
                                                                  usuario_cadastro_senha.getText().toString(),
                                                     false));

                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

    }
}
