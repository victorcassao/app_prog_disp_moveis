package com.example.noticiando.database;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.noticiando.objects.Noticia;
import com.example.noticiando.objects.Usuario;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Objects;

public class BancoController implements Serializable {
    private SQLiteDatabase db;
    private CriarBanco banco;

    public BancoController(Context context){
        banco = new CriarBanco(context);
    }

    public ArrayList<Integer> retornaListaPreferenciarUsuario(Usuario user){
        ArrayList<Integer> preferenciasUsuario = new ArrayList<>();
        db = banco.getReadableDatabase();
        String sql_busca_pessoas = "SELECT * FROM " + CriarBanco.TABELA_USUARIO_CATEG_NOTICIA + " WHERE " + CriarBanco.FK_USUARIO + " = " + user.getId();
        Cursor c = db.rawQuery(sql_busca_pessoas, null);
        while (c.moveToNext()) {
            preferenciasUsuario.add(c.getInt(1));
        }
        return preferenciasUsuario;
    }

    public Boolean insereDadoUsuario(Usuario pessoa) throws Exception {
        db = banco.getWritableDatabase();
        ContentValues valores;
        long resultado;
        valores = new ContentValues();

        valores.put(CriarBanco.NOME_USUARIO, pessoa.getNome());
        valores.put(CriarBanco.USERNAME, pessoa.getUser());
        valores.put(CriarBanco.SENHA_USUARIO, gerarHash(pessoa.getSenha()));
        valores.put(CriarBanco.ISADMINISTRATOR, pessoa.isAdministrator());
        valores.put(CriarBanco.ISACTIVE, pessoa.isActive());
        valores.put(CriarBanco.ESCOLHA_CATEG_NOTICIA, false);

        resultado = db.insert(CriarBanco.TABELA_USUARIO, null, valores);

        if (resultado == -1) {
            return false;
        } else {
            return true;
        }
    }

    public boolean autenticaUsuario(String usuario, String senha) throws Exception {
        db = banco.getReadableDatabase();
        String sql_busca_pessoas = "SELECT * FROM usuario WHERE username = " + "'" + usuario + "'";
        Cursor c = db.rawQuery(sql_busca_pessoas, null);
        while (c.moveToNext()) {
            if (Objects.equals(gerarHash(senha), c.getString(3))) {
                return true;
            }else {
                return false;
            }
        }
//        c.close();
        return false;
    }

    public boolean checaCadastroCategoriaNoticia(String usuario) throws Exception {
        db = banco.getReadableDatabase();
        String sql_busca_pessoas = "SELECT * FROM usuario WHERE username = " + "'" + usuario + "'";
        Cursor c = db.rawQuery(sql_busca_pessoas, null);
        c.moveToFirst();
        Boolean retorno = c.getInt(6) == 0?false:true;

        if (retorno) {
            Log.d("query_deu_bom","Sucesso ao inserir a categoria da noticia  - Valor retornado = " + retorno);
        } else {
            Log.d("query_deu_ruim","Erro ao inserir a categoria da noticia - Valor retornado = " + retorno);
        }

        return retorno;
    }

    @SuppressLint("Range")
    public Usuario getUsuario(String nome_usuario){
        db = banco.getReadableDatabase();
        String sql_retorna_usuario = "SELECT * FROM " + banco.TABELA_USUARIO + " WHERE username = '" + nome_usuario + "'";
        Cursor cursor = db.rawQuery(sql_retorna_usuario,null);
        Usuario user_temp = new Usuario();
        while(cursor.moveToNext()){
            if(Objects.equals(nome_usuario, cursor.getString(2))){
                user_temp.setId(cursor.getInt(0)); // Setando ID
                user_temp.setNome(cursor.getString(1)); // Setando nome
                user_temp.setUser(cursor.getString(2)); // Setando username
                user_temp.setSenha(cursor.getString(3)); // Setando senha
                user_temp.setAdministrator((cursor.getInt(4)==0?false:true)); // Setando se é adm ou não
            }
        }
        Log.d("getUsuario","Nome do usuário: " + user_temp.getNome());
        return user_temp;
    }

    public void insereNoticia(Noticia noticia, String categoria){
        db = banco.getWritableDatabase();

        ContentValues valores;
        long resultado;
        valores = new ContentValues();

        valores.put(CriarBanco.AUTOR_NOTICIAS, noticia.getAutor());
        valores.put(CriarBanco.CONTEUDO_NOTICIAS, noticia.getConteudo());
        valores.put(CriarBanco.DESCRICAO_NOTICIAS, noticia.getDescricao());
        valores.put(CriarBanco.DATA_PUBLICACAO_NOTICIAS, noticia.getDataPublicacao());
        valores.put(CriarBanco.TITULO_NOTICIAS, noticia.getTitulo());
        valores.put(CriarBanco.URL_NOTICIAS, noticia.getUrl());
        valores.put(CriarBanco.URL_TO_NOTICIAS, noticia.getUrlToImage());
        valores.put(CriarBanco.CATEGORIA_NOTICIAS, categoria);

        resultado = db.insert(CriarBanco.TABELA_NOTICIAS, null, valores);

        if (resultado == -1) {
            Log.d("erro_noticia","Erro ao inserir a noticia " + noticia.getTitulo());
        } else {
            Log.d("sucesso_noticia","Sucesso ao inserir a noticia " + noticia.getTitulo());
        }
    }

    public void insereCategoriaNoticia(String nome_categoria_noticia){
        db = banco.getWritableDatabase();

        ContentValues valores;
        long resultado;
        valores = new ContentValues();

        valores.put(CriarBanco.NOME_CATEG_NOTICIA, nome_categoria_noticia);

        resultado = db.insert(CriarBanco.TABELA_CATEGORIAS_NOTICIAS, null, valores);

        if (resultado == -1) {
            Log.d("erro_categoria_noticia","Erro ao inserir a categoria da noticia " + nome_categoria_noticia);
        } else {
            Log.d("sucesso_categ_noticia","Sucesso ao inserir a categoria da noticia " + nome_categoria_noticia);
        }

    }

    public void insereUsuarioCategoria(Usuario user, Integer id_categoria){
        db = banco.getWritableDatabase();

        ContentValues valores;
        long resultado;
        valores = new ContentValues();

        valores.put(CriarBanco.FK_USUARIO, user.getId());
        valores.put(CriarBanco.FK_CATEG_NOTICIA, id_categoria);

        resultado = db.insert(CriarBanco.TABELA_USUARIO_CATEG_NOTICIA, null, valores);

        if (resultado == -1) {
            Log.d("erro_inserir_uscat","Erro ao inserir a categoria da noticia " + id_categoria + " no usuário " + user.getNome());
        } else {
            Log.d("sucesso_inserir_uscat","Sucesso ao inserir a categoria da noticia " + id_categoria + " no usuário " + user.getNome());
        }
    }

    public void atualizaFlagCategoriaNoticia(Usuario user){

        db = banco.getWritableDatabase();

        ContentValues valores;
        long resultado;
        valores = new ContentValues();

        valores.put(CriarBanco.ESCOLHA_CATEG_NOTICIA, true);

        resultado = db.update(CriarBanco.TABELA_USUARIO,valores,"_id = " + user.getId(),null);

        if (resultado == -1) {
            Log.d("erro_inserir_uscat","Erro ao atualizar a flag de já cadastrado categoria de preferencia no usuário " + user.getNome());
        } else {
            Log.d("sucesso_inserir_uscat","Sucesso ao atualizar a flag de já cadastrado categoria de preferencia no usuário " + user.getNome());
        }


    }

    public static String gerarHash(String senha) throws Exception {
        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte hash[] = algorithm.digest(senha.getBytes("UTF-8"));

        StringBuilder texto = new StringBuilder();
        for (byte b : hash) {
            texto.append(String.format("%02X", 0xFF & b));
        }
        return texto.toString();
    }

}
