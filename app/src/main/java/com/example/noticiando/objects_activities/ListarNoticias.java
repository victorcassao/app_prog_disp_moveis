package com.example.noticiando.objects_activities;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.noticiando.R;
import com.example.noticiando.database.BancoController;
import com.example.noticiando.objects.Usuario;

import java.io.Serializable;
import java.util.ArrayList;

public class ListarNoticias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_noticias);
        TextView mostra_nome_usuario = findViewById(R.id.usuarioLogado);
        Intent intent = getIntent();
        Usuario user = (Usuario) intent.getSerializableExtra("usuario");
        mostra_nome_usuario.setText(user.getNome());

        BancoController db = new BancoController(this);

        // Select pra pegar as preferencias
        ArrayList<Integer> preferenciasUsuario = new ArrayList<>();
        preferenciasUsuario = db.retornaListaPreferenciarUsuario(user);

        Bundle bundle = new Bundle();
//        bundle.putIntegerArrayList("pref_user",preferenciasUsuario);
        bundle.putSerializable("db", (Serializable) db);
        bundle.putSerializable("user", (Serializable) user);

        FragmentManager fragmentManager =  getSupportFragmentManager();
        FragmentListaNoticias fragInfos = new FragmentListaNoticias();
        fragInfos.setArguments(bundle);

        fragmentManager.beginTransaction()
                .add(R.id.fragmentNoticias,fragInfos)
                .commit();
    }
}