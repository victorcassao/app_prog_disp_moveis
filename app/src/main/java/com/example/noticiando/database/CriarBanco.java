package com.example.noticiando.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CriarBanco extends SQLiteOpenHelper{
    //Dados gerais da base de dados
    public static final String NOME_BASE_DADOS_NOTICIANDO = "noticiando.db";

    // Versionamento banco de dados
    public static final int VERSAO = 12;

    // Dados tabela usuario
    public static final String TABELA_USUARIO = "usuario";
    public static final String ID_USUARIO = "_id";
    public static final String NOME_USUARIO = "nome";
    public static final String USERNAME = "username";
    public static final String SENHA_USUARIO = "senha";
    public static final String ISADMINISTRATOR = "isAdministrator";
    public static final String ISACTIVE = "isActive";

    // Dados tabela noticias
    public static final String TABELA_NOTICIAS = "noticias";
    public static final String ID_NOTICIAS = "_id";
    public static final String AUTOR_NOTICIAS = "nome_autor";
    public static final String CONTEUDO_NOTICIAS = "conteudo_noticia";
    public static final String DESCRICAO_NOTICIAS = "descricao_noticia";
    public static final String DATA_PUBLICACAO_NOTICIAS = "data_publicacao";
    public static final String TITULO_NOTICIAS = "titulo_noticia";
    public static final String URL_NOTICIAS = "url_para_noticia";
    public static final String URL_TO_NOTICIAS = "url_para_imagem_noticia";
    public static final String CATEGORIA_NOTICIAS = "categoria_noticia";

    public CriarBanco(Context context){
        super(context, NOME_BASE_DADOS_NOTICIANDO,null , VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Criando tabela do usuário
        String QUERY_CRIAR_TABELA_USUARIO = "CREATE TABLE " + TABELA_USUARIO +" ("
                + ID_USUARIO +" INTEGER PRIMARY KEY AUTOINCREMENT,"
                + NOME_USUARIO + " TEXT,"
                + USERNAME + " TEXT UNIQUE,"
                + SENHA_USUARIO + " TEXT,"
                + ISADMINISTRATOR + " BOOLEAN, "
                + ISACTIVE + " BOOLEAN"
                +")";

        // Criando tabela das noticias
        String QUERY_CRIAR_TABELA_NOTICIAS = "CREATE TABLE " + TABELA_NOTICIAS + " ("
                + ID_NOTICIAS + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + AUTOR_NOTICIAS + " TEXT,"
                + CONTEUDO_NOTICIAS + " TEXT,"
                + DESCRICAO_NOTICIAS + " TEXT,"
                + DATA_PUBLICACAO_NOTICIAS + " DATETIME, "
                + TITULO_NOTICIAS + " TEXT,"
                + URL_NOTICIAS + " TEXT,"
                + URL_TO_NOTICIAS + " TEXT, "
                + CATEGORIA_NOTICIAS + " TEXT"
                +")";

        db.execSQL(QUERY_CRIAR_TABELA_USUARIO);
        db.execSQL(QUERY_CRIAR_TABELA_NOTICIAS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS " + TABELA_USUARIO;
        String sql2 = "DROP TABLE IF EXISTS " + TABELA_NOTICIAS;
        db.execSQL(sql);
        db.execSQL(sql2);
        onCreate(db);
    }
}
