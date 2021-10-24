package com.example.noticiando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.noticiando.MainActivity;
import com.example.noticiando.R;
import com.example.noticiando.database.BancoController;
import com.example.noticiando.objects.Usuario;

public class LoginActivity extends AppCompatActivity {

    EditText usuario_login;
    EditText senha_login;
    Button botao_login;

    BancoController db = new BancoController(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario_login = findViewById(R.id.usuario_login);
        senha_login = findViewById(R.id.senha_login);
        botao_login = findViewById(R.id.botao_login);

           botao_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean resultado = db.autenticaUsuario(usuario_login.getText().toString(), senha_login.getText().toString());
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
