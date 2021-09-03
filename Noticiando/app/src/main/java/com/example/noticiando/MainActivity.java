package com.example.noticiando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Button botao;
    Button botao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listNoticias = (ListView) findViewById(R.id.lista_noticias);

        String[] noticias = new String[]{"Noticia 1", "Noticia 2","Noticia 3"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,noticias);

        listNoticias.setAdapter(adapter);


//        Noticia noticia = new Noticia("Menor dá o rabo",
//                                    "Menor é pego dando o rabo","O menor foi visto pelos estudantes dando o rabo no banheiro...",
//                                    "http:teste.com.br");

//        ArrayList<Noticia> listNoticias = null;
//
//        listNoticias.add(noticia);


//        botao = findViewById(R.id.botaoprox);
//        botao.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Mandando pra segunda tela
//                // Intent it = new Intent(MainActivity.this, NoticiaDetail.class);
//                Intent it = new Intent(getApplicationContext(),NoticiaDetail.class);
//                Bundle parametros = new Bundle();
//                parametros.putString("titulo",noticia.getTittulo());
//                parametros.putString("descricao",noticia.getDescricao());
//                it.putExtras(parametros);
//                startActivity(it);
//
//            }
//        });
//
//        botao2 = findViewById(R.id.button2);
//        botao2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TextView tela_teste = findViewById(R.id.tela_noticia);
//
//                tela_teste.setText(noticia.getTittulo());
//            }
//        });






    }


}