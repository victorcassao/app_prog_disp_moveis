package com.example.noticiando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {

    public void testando_json(String list_json) throws JSONException {
        JSONObject my_obj = new JSONObject(list_json);

        String content = my_obj.getString("author");

        Toast.makeText(getApplicationContext(),content, Toast.LENGTH_LONG).show();
    }

    String json_string = "{'author': 'Josh Partlow',\n" +
            "   'content': 'He asked me two or three times, Abdullah recalled. We were back and forth on the telephone. And then he [asked] if the two of us could be together? I said, Thats a good idea. \\r\\nStory continues below … [+9129 chars]',\n" +
            "   'description': '',\n" +
            "   'publishedAt': '2021-09-03T00:31:57Z',\n" +
            "   'source': {'id': 'the-washington-post', 'name': 'The Washington Post'},\n" +
            "   'title': 'Hamid Karzai is back in the thick of Afghan politics but a long way from power. - The Washington Post',\n" +
            "   'url': 'https://www.washingtonpost.com/world/2021/09/02/afghanistan-karzai-taliban-government-power/',\n" +
            "   'urlToImage': 'https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/7T2CYYA3OUI6VF32CWTHCDWW3I.jpg&w=1440'}";


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

        // criar ação para evento de click na notícia
        listNoticias.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
//                Toast.makeText(getApplicationContext(),
//                        "Clicou no item " + position,
//                        Toast.LENGTH_LONG).show();

                try {
                    testando_json(json_string);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });






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