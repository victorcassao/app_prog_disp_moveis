package com.example.noticiando.objects_activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.noticiando.R;
import com.example.noticiando.database.BancoController;
import com.example.noticiando.objects.APINewsHelper;
import com.example.noticiando.objects.Noticia;
import com.example.noticiando.objects.Usuario;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentListaNoticias#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentListaNoticias extends Fragment {

    public ArrayList<Noticia> criarNoticias(String json_string_noticias) throws JSONException {

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

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    @SuppressLint("ValidFragment")
    public FragmentListaNoticias() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListaNoticias.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentListaNoticias newInstance(String param1, String param2) {
        FragmentListaNoticias fragment = new FragmentListaNoticias();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        Bundle bundle = getArguments();

        BancoController db = (BancoController) bundle.getSerializable("db");
        Usuario user = (Usuario) bundle.getSerializable("user");

        // Select das preferencias de categoria das noticias do usuário logado.
        ArrayList<Integer> preferenciasUsuario = db.retornaListaPreferenciarUsuario(user);
        ArrayList<Noticia> listaTemp = new ArrayList<>();
        for (int i = 0; i < preferenciasUsuario.size(); i++){
            Log.d("preferenciasUsuario","Item do arraylist na posição : " + i + " - Valor = " + preferenciasUsuario.get(i));
        }

        for (int i = 0; i < preferenciasUsuario.size(); i++){
            listaTemp = db.retornaListaNoticiasPorCategoria(preferenciasUsuario.get(i));

            for(int x = 0; x < listaTemp.size(); x++){
                listaNoticias.add(listaTemp.get(x));
            }
        }

//        listaNoticias =

        // -========================================================================-
//        try {
//            listaNoticias = criarNoticias(apiNewsHelper.getJson_string());
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        View listView = getActivity().findViewById(R.id.list);
        ListView listNoticias = (ListView) getActivity().findViewById(R.id.listaViewNoticias);
        ArrayList<String> noticias = new ArrayList<String>();

        for(Noticia notTemp : listaNoticias){
            noticias.add(notTemp.getTitulo());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), R.layout.support_simple_spinner_dropdown_item,noticias);
        listNoticias.setAdapter(adapter);

        // criar ação para evento de click na notícia
        listNoticias.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Mandando pra segunda tela
                Intent it = new Intent(getActivity(), NoticiaDetail.class);
//                Bundle parametros = new Bundle();
//                parametros.putSerializable("noticia",listaNoticias.get(position));
//                parametros.putString("titulo", listaNoticias.get(position).getTitulo());
//                parametros.putString("autor", listaNoticias.get(position).getAutor());
//                parametros.putString("data_publicacao", listaNoticias.get(position).getDataPublicacao());
//                parametros.putString("descricao", listaNoticias.get(position).getDescricao());
//                parametros.putString("conteudo_noticia", listaNoticias.get(position).getConteudo());
//                parametros.putString("url", listaNoticias.get(position).getUrl());
//                parametros.putString("url_to_image", listaNoticias.get(position).getUrlToImage());

//                it.putExtras(parametros);
                it.putExtra("teste","testando");
                startActivity(it);
            }
        });
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_noticias, container, false);

    }
}