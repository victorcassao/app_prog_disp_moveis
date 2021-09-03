package com.example.noticiando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NoticiaDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia_detail);

        Intent recebendo_info = getIntent();

        Bundle parametros = recebendo_info.getExtras();

        TextView titulo_noticia_tv = findViewById(R.id.titulo_noticia);
        TextView descricao_noticia_tv = findViewById(R.id.descricao_noticia);

        titulo_noticia_tv.setText(parametros.getString("titulo"));
        descricao_noticia_tv.setText(parametros.getString("descricao"));


    }
}