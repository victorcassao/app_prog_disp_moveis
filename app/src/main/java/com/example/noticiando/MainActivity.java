package com.example.noticiando;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.noticiando.database.BancoController;
import com.example.noticiando.objects.APINewsHelper;
import com.example.noticiando.objects.Noticia;
import com.example.noticiando.objects.Usuario;
import com.example.noticiando.objects_activities.NoticiaDetail;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    BancoController bancoController = new BancoController(this);

    public ArrayList<Noticia> criarNoticias(String json_string_noticias) throws JSONException {
        ArrayList<Noticia> listaNoticias = new ArrayList<Noticia>();

        JSONObject my_obj = new JSONObject(json_string_noticias);
        JSONArray noticias = my_obj.getJSONArray("articles");

        for(int i = 0; i < noticias.length(); i++){
            JSONObject obj_temp = noticias.getJSONObject(i);
            Noticia temp = new Noticia(obj_temp.getString("author"), obj_temp.getString("content"), obj_temp.getString("description"),
                    obj_temp.getString("publishedAt"), obj_temp.getString("title"), obj_temp.getString("url"), obj_temp.getString("urlToImage"));
            listaNoticias.add(temp);
        }

        return listaNoticias;
    }

    ArrayList<Noticia> listaNoticias = new ArrayList<Noticia>();
    APINewsHelper apiNewsHelper = new APINewsHelper();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try {
            listaNoticias = criarNoticias(apiNewsHelper.getJson_string());
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
                Intent it = new Intent(getApplicationContext(), NoticiaDetail.class);
                Bundle parametros = new Bundle();

                parametros.putString("titulo", listaNoticias.get(position).getTitulo());
                parametros.putString("autor", listaNoticias.get(position).getAutor());
                parametros.putString("data_publicacao", listaNoticias.get(position).getDataPublicacao());
                parametros.putString("descricao", listaNoticias.get(position).getDescricao());
                parametros.putString("conteudo_noticia", listaNoticias.get(position).getConteudo());
                parametros.putString("url", listaNoticias.get(position).getUrl());
                parametros.putString("url_to_image", listaNoticias.get(position).getUrlToImage());

                it.putExtras(parametros);
                startActivity(it);
            }
        });

    };

};

