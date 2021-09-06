package com.example.noticiando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class NoticiaDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia_detail);

        Intent recebendo_info = getIntent();

        Bundle parametros = recebendo_info.getExtras();

        TextView titulo_noticia_tv = findViewById(R.id.titulo_noticia);
        TextView autor_noticia_tv = findViewById(R.id.autor_noticia);
        TextView dt_publicacao_noticia_tv = findViewById(R.id.dt_publicacao_noticia);
        TextView descricao_noticia_tv = findViewById(R.id.descricao_noticia);
        TextView conteudo_noticia_tv = findViewById(R.id.conteudo_noticia);
        TextView url_noticia_tv = findViewById(R.id.url_noticia);
        ImageView img_noticia = (ImageView) findViewById(R.id.img_noticias);

        titulo_noticia_tv.setText(parametros.getString("titulo"));
        autor_noticia_tv.setText(parametros.getString("autor"));
        dt_publicacao_noticia_tv.setText(parametros.getString("data_publicacao"));
        descricao_noticia_tv.setText(parametros.getString("descricao"));
        conteudo_noticia_tv.setText(parametros.getString("conteudo_noticia"));
        url_noticia_tv.setText(parametros.getString("url"));
        Picasso.get().load(parametros.getString("url_to_image")).into(img_noticia);



    }
}