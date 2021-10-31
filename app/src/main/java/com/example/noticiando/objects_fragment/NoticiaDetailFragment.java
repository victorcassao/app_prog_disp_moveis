package com.example.noticiando.objects_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.SharedElementCallback;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.noticiando.R;
import com.example.noticiando.objects.Noticia;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NoticiaDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NoticiaDetailFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NoticiaDetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NoticiaDetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NoticiaDetailFragment newInstance(String param1, String param2) {
        NoticiaDetailFragment fragment = new NoticiaDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
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
        View view = inflater.inflate(R.layout.fragment_noticia_detail, container, false);

        TextView titulo_noticia_tv = view.findViewById(R.id.titulo_noticia);
        TextView autor_noticia_tv = view.findViewById(R.id.autor_noticia);
        TextView dt_publicacao_noticia_tv = view.findViewById(R.id.dt_publicacao_noticia);
        TextView descricao_noticia_tv = view.findViewById(R.id.descricao_noticia);
        TextView conteudo_noticia_tv = view.findViewById(R.id.conteudo_noticia);
        TextView url_noticia_tv = view.findViewById(R.id.url_noticia);
        ImageView img_noticia = (ImageView) view.findViewById(R.id.img_noticias);

        Bundle dado_recebido = this.getArguments();
        Noticia noticia_recebida = (Noticia) dado_recebido.getSerializable("noticia");

        titulo_noticia_tv.setText(noticia_recebida.getTitulo());
        autor_noticia_tv.setText(noticia_recebida.getAutor().equals("null")?"Desconhecido":noticia_recebida.getAutor());
        dt_publicacao_noticia_tv.setText(noticia_recebida.getDataPublicacao().substring(0,10) + " as " + noticia_recebida.getDataPublicacao().substring(11,16));
        descricao_noticia_tv.setText(noticia_recebida.getDescricao());
        conteudo_noticia_tv.setText(noticia_recebida.getConteudo().substring(0,noticia_recebida.getConteudo().length()-14)+"[Leia mais clicando no link do final da página]");
        url_noticia_tv.setText(noticia_recebida.getUrl());
        Picasso.get().load(noticia_recebida.getUrlToImage()).into(img_noticia);

        return view;
    }


}