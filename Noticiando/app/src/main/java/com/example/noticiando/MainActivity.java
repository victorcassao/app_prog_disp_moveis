package com.example.noticiando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {

    public ArrayList<Noticia> criarNoticias(String json_string_noticias) throws JSONException {
        ArrayList<Noticia> listaNoticias = new ArrayList<Noticia>();

        JSONObject my_obj = new JSONObject(json_string_noticias);
        JSONArray noticias = my_obj.getJSONArray("articles");

        for(int i = 0; i < noticias.length(); i++){
            JSONObject obj_temp = noticias.getJSONObject(i);
            Noticia temp = new Noticia(obj_temp.getString("content"), obj_temp.getString("title"),
                                       obj_temp.getString("description"),obj_temp.getString("url"));
            listaNoticias.add(temp);
        }

        return listaNoticias;
    }

    String json_string_noticias = "{\n" +
            "    'articles': \n" +
            "    [\n" +
            "        {\n" +
            "            'author': None,\n" +
            "            'content': 'Parents struggling to balance work and homeschooling say moving the school holidays forward would take the pressure off.\\r\\n National wants the Government to look seriously into moving holidays earlier… [+3974 chars]',\n" +
            "            'description': 'Parents struggling to balance work and homeschooling say moving the school holidays forward would make their lives easier.',\n" +
            "            'publishedAt': '2021-09-03T00:33:00Z',\n" +
            "            'source': {'id': None, 'name': 'Stuff.co.nz'},\n" +
            "            'title': 'Moving school holidays would take pressure off lockdown juggle, parents say - Stuff.co.nz',\n" +
            "            'url': 'https://www.stuff.co.nz/national/education/300397721/moving-school-holidays-would-take-pressure-off-lockdown-juggle-parents-say',\n" +
            "            'urlToImage': 'https://resources.stuff.co.nz/content/dam/images/4/y/u/l/0/d/image.related.StuffLandscapeSixteenByNine.1420x800.4yukd5.png/1630629197182.jpg'\n" +
            "        },\n" +
            "        {\n" +
            "            'author': 'Josh Partlow',\n" +
            "            'content': 'He asked me two or three times, Abdullah recalled. We were back and forth on the telephone. And then he [asked] if the two of us could be together? I said, Thats a good idea. \\r\\nStory continues below … [+9129 chars]',\n" +
            "            'description': 'Oh my good',\n" +
            "            'publishedAt': '2021-09-03T00:31:57Z',\n" +
            "            'source': {'id': 'the-washington-post', 'name': 'The Washington Post'},\n" +
            "            'title': 'Hamid Karzai is back in the thick of Afghan politics but a long way from power. - The Washington Post',\n" +
            "            'url': 'https://www.washingtonpost.com/world/2021/09/02/afghanistan-karzai-taliban-government-power/',\n" +
            "            'urlToImage': 'https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/7T2CYYA3OUI6VF32CWTHCDWW3I.jpg&w=1440'\n" +
            "        },\n" +
            "        {\n" +
            "            'author': 'Eurosport',\n" +
            "            'content': 'England players celebrate, Hungary v England, World Cup qualifying, Puskas Arena, Budapest, September 2, 2021\\r\\nImage credit: Getty Images',\n" +
            "            'description': 'England comfortably beat Hungary 4-0 in Budapest, on an evening overshadowed by abhorrent behaviour from a section of the home fans.',\n" +
            "            'publishedAt': '2021-09-02T23:25:00Z',\n" +
            "            'source': {'id': None, 'name': 'Eurosport.com AU'},\n" +
            "            'title': 'Sterling sparks England win in hostile atmosphere to see off Hungary - Eurosport COM',\n" +
            "            'url': 'https://www.eurosport.com/football/world-cup-qualification-uefa/2022/football-news-hungary-v-england-follow-live-coverage_sto8511678/story.shtml',\n" +
            "            'urlToImage': 'https://i.eurosport.com/2021/09/02/3212006-65795388-2560-1440.jpg'\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    Button botao;
    Button botao2;
    ArrayList<Noticia> listaNoticias = new ArrayList<Noticia>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            listaNoticias = criarNoticias(json_string_noticias);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        ListView listNoticias = (ListView) findViewById(R.id.lista_noticias);
        ArrayList<String> noticias = new ArrayList<String>();

        for(Noticia notTemp : listaNoticias){
            noticias.add(notTemp.getTitulo());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,noticias);
        listNoticias.setAdapter(adapter);

        // criar ação para evento de click na notícia
        listNoticias.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Mandando pra segunda tela
                // Intent it = new Intent(MainActivity.this, NoticiaDetail.class);
                Intent it = new Intent(getApplicationContext(), NoticiaDetail.class);
                Bundle parametros = new Bundle();

                parametros.putString("nome", listaNoticias.get(position).getNome());
                parametros.putString("titulo", listaNoticias.get(position).getTitulo());
                parametros.putString("descricao", listaNoticias.get(position).getDescricao());
                parametros.putString("url", listaNoticias.get(position).getUrl());
                it.putExtras(parametros);
                startActivity(it);
            }
        });







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



    };


};