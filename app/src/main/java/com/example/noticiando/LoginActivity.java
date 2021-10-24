package com.example.noticiando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.noticiando.MainActivity;
import com.example.noticiando.R;
import com.example.noticiando.database.BancoController;
import com.example.noticiando.objects.CarregaNoticias;
import com.example.noticiando.objects.CadastroUsuario;
import com.example.noticiando.objects.Usuario;

import org.json.JSONException;

public class LoginActivity extends AppCompatActivity {

    EditText usuario_login;
    EditText senha_login;
    Button botao_login;
    Button botao_cadastra;

    BancoController db = new BancoController(this);
    CarregaNoticias init = new CarregaNoticias(db);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        try {
            init.importAll();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Usuario victor = new Usuario("Victor Cassão2","cassao2","12345",false);
        Boolean resultado = null;

        try {
            resultado = db.insereDadoUsuario(victor);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(resultado){
            Log.d("erro_ao_inserir", "O dado não foi inserido, amigo." + resultado);
        }else{
            Log.d("sucesso_ao_inserir", "O dado foi inserido, amigo.");
        }

        usuario_login = findViewById(R.id.usuario_login);
        senha_login = findViewById(R.id.senha_login);
        botao_login = findViewById(R.id.botao_login);
        botao_cadastra = findViewById(R.id.botao_cadastra);

           botao_cadastra.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent = new Intent(getApplicationContext(), CadastroUsuario.class);
                   startActivity(intent);
               }
           });

           botao_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean resultado = false;
                try {
                    resultado = db.autenticaUsuario(usuario_login.getText().toString(), senha_login.getText().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if(resultado == true){
//                    Usuario user = db.getUsuario(usuario_login.getText().toString());
//                    Toast toast = Toast.makeText(getApplicationContext(), "ID usuário" + user.getId() + " - Nome usuario: " + user.getNome(), Toast.LENGTH_SHORT);
//                    toast.show();

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                  //  intent.putExtra("usuario", user);
                    startActivity(intent);
                }else{
                    usuario_login.setText("");
                    senha_login.setText("");
                    usuario_login.requestFocus();
                    Toast toast = Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }


}
