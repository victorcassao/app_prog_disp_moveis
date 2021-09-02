package com.example.noticiando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ListView noticia = findViewById(R.id.lvNoticias);
//        String[] dados = new String[]{"teste1", "teste1"}

        ListView listaNoticias = (ListView) findViewById(R.id.lvNoticias);
        ArrayList<String> noticias = preencherDados();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, noticias);
        listaNoticias.setAdapter(ArrayAdapter);


//        ArrayAdapter<String> adapter = new ArrayAdapter<String>
//                (this, android.R.layout.simple_list_item_1,dados);



        botao = findViewById(R.id.botaoprox);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, NoticiaDetail.class);
                startActivity(it);
            }
        });
    }

    private ArrayList<String> preencherDados(){
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Teste1");
        dados.add("Teste2");
        dados.add("Teste3");
        dados.add("Teste4");
        return dados;
    }


}