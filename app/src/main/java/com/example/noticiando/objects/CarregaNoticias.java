package com.example.noticiando.objects;

import com.example.noticiando.database.BancoController;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class CarregaNoticias {
    private final String categoria_negocios = "Negocios";
    private final String categoria_entretenimento = "Entretenimento";
    private final String categoria_geral = "Geral";
    private final String categoria_saude = "Saude";
    private final String categoria_ciencia = "Ciencia";
    private final String categoria_esportes = "Esportes";
    private final String categoria_tecnologia = "Tecnologia";
    private BancoController db;

    public CarregaNoticias(BancoController db) {
        this.db = db;
    }

    public void importAll() throws JSONException {
        carregarCategoriaNoticias();
        carregarNoticiasEsportes();
        carregarNoticiasTecnologia();
        carregarNoticiasCiencia();
        carregarNoticiasEntretenimento();
        carregarNoticiasGeral();
        carregarNoticiasNegocios();
        carregarNoticiasSaude();
    }

    private void carregarCategoriaNoticias(){
        db.insereCategoriaNoticia(this.categoria_negocios);
        db.insereCategoriaNoticia(this.categoria_entretenimento);
        db.insereCategoriaNoticia(this.categoria_geral);
        db.insereCategoriaNoticia(this.categoria_saude);
        db.insereCategoriaNoticia(this.categoria_ciencia);
        db.insereCategoriaNoticia(this.categoria_esportes);
        db.insereCategoriaNoticia(this.categoria_tecnologia);
    }

    private void carregarNoticiasEsportes() throws JSONException {
        JSONObject my_obj = new JSONObject(APINewsHelper.getCategoria_esportes());
        JSONArray noticias = my_obj.getJSONArray("articles");
        Integer id_noticia = db.getIDCategoriaNoticia(this.categoria_esportes);

        for(int i = 0; i < noticias.length(); i++){
            JSONObject obj_temp = noticias.getJSONObject(i);
            db.insereNoticia(new Noticia(obj_temp.getString("author"),
                    obj_temp.getString("content"),
                    obj_temp.getString("description"),
                    obj_temp.getString("publishedAt"),
                    obj_temp.getString("title"),
                    obj_temp.getString("url"),
                    obj_temp.getString("urlToImage")),id_noticia);
        }
    }

    private void carregarNoticiasTecnologia() throws JSONException {
        JSONObject my_obj = new JSONObject(APINewsHelper.getCategoria_tecnologia());
        JSONArray noticias = my_obj.getJSONArray("articles");
        Integer id_noticia = db.getIDCategoriaNoticia(this.categoria_tecnologia);

        for(int i = 0; i < noticias.length(); i++){
            JSONObject obj_temp = noticias.getJSONObject(i);
            db.insereNoticia(new Noticia(obj_temp.getString("author"),
                    obj_temp.getString("content"),
                    obj_temp.getString("description"),
                    obj_temp.getString("publishedAt"),
                    obj_temp.getString("title"),
                    obj_temp.getString("url"),
                    obj_temp.getString("urlToImage")),id_noticia);
        }
    }

    private void carregarNoticiasNegocios() throws JSONException {
        JSONObject my_obj = new JSONObject(APINewsHelper.getCategoria_negocios());
        JSONArray noticias = my_obj.getJSONArray("articles");
        Integer id_noticia = db.getIDCategoriaNoticia(this.categoria_negocios);

        for(int i = 0; i < noticias.length(); i++){
            JSONObject obj_temp = noticias.getJSONObject(i);
            db.insereNoticia(new Noticia(obj_temp.getString("author"),
                    obj_temp.getString("content"),
                    obj_temp.getString("description"),
                    obj_temp.getString("publishedAt"),
                    obj_temp.getString("title"),
                    obj_temp.getString("url"),
                    obj_temp.getString("urlToImage")),id_noticia);
        }
    }

    private void carregarNoticiasEntretenimento() throws JSONException {
        JSONObject my_obj = new JSONObject(APINewsHelper.getCategoria_entretenimento());
        JSONArray noticias = my_obj.getJSONArray("articles");
        Integer id_noticia = db.getIDCategoriaNoticia(this.categoria_entretenimento);

        for(int i = 0; i < noticias.length(); i++){
            JSONObject obj_temp = noticias.getJSONObject(i);
            db.insereNoticia(new Noticia(obj_temp.getString("author"),
                    obj_temp.getString("content"),
                    obj_temp.getString("description"),
                    obj_temp.getString("publishedAt"),
                    obj_temp.getString("title"),
                    obj_temp.getString("url"),
                    obj_temp.getString("urlToImage")),id_noticia);
        }
    }

    private void carregarNoticiasGeral() throws JSONException {
        JSONObject my_obj = new JSONObject(APINewsHelper.getCategoria_geral());
        JSONArray noticias = my_obj.getJSONArray("articles");
        Integer id_noticia = db.getIDCategoriaNoticia(this.categoria_geral);

        for(int i = 0; i < noticias.length(); i++){
            JSONObject obj_temp = noticias.getJSONObject(i);
            db.insereNoticia(new Noticia(obj_temp.getString("author"),
                    obj_temp.getString("content"),
                    obj_temp.getString("description"),
                    obj_temp.getString("publishedAt"),
                    obj_temp.getString("title"),
                    obj_temp.getString("url"),
                    obj_temp.getString("urlToImage")),id_noticia);
        }
    }

    private void carregarNoticiasSaude() throws JSONException {
        JSONObject my_obj = new JSONObject(APINewsHelper.getCategoria_saude());
        JSONArray noticias = my_obj.getJSONArray("articles");
        Integer id_noticia = db.getIDCategoriaNoticia(this.categoria_saude);

        for(int i = 0; i < noticias.length(); i++){
            JSONObject obj_temp = noticias.getJSONObject(i);
            db.insereNoticia(new Noticia(obj_temp.getString("author"),
                    obj_temp.getString("content"),
                    obj_temp.getString("description"),
                    obj_temp.getString("publishedAt"),
                    obj_temp.getString("title"),
                    obj_temp.getString("url"),
                    obj_temp.getString("urlToImage")),id_noticia);
        }
    }

    private void carregarNoticiasCiencia() throws JSONException {
        JSONObject my_obj = new JSONObject(APINewsHelper.getCategoria_ciencia());
        JSONArray noticias = my_obj.getJSONArray("articles");
        Integer id_noticia = db.getIDCategoriaNoticia(this.categoria_ciencia);

        for(int i = 0; i < noticias.length(); i++){
            JSONObject obj_temp = noticias.getJSONObject(i);
            db.insereNoticia(new Noticia(obj_temp.getString("author"),
                    obj_temp.getString("content"),
                    obj_temp.getString("description"),
                    obj_temp.getString("publishedAt"),
                    obj_temp.getString("title"),
                    obj_temp.getString("url"),
                    obj_temp.getString("urlToImage")),id_noticia);
        }
    }



}
