package com.example.noticiando.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CriarBanco extends SQLiteOpenHelper{
    //Dados gerais da base de dados
    public static final String NOME_BASE_DADOS_NOTICIANDO = "noticiando.db";

    // Versionamento banco de dados
    public static final int VERSAO = 4;

    // Dados tabela usuario
    public static final String TABELA_USUARIO = "usuario";
    public static final String ID_USUARIO = "_id";
    public static final String NOME_USUARIO = "nome";
    public static final String USERNAME = "username";
    public static final String SENHA_USUARIO = "senha";
    public static final String ISADMINISTRATOR = "isAdministrator";
    public static final String ISACTIVE = "isActive";

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
        db.execSQL(QUERY_CRIAR_TABELA_USUARIO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS " + TABELA_USUARIO;
//      String sql2 = "DROP TABLE IF EXISTS " + TABELA_VEICULO;
        db.execSQL(sql);
//      db.execSQL(sql2);
        onCreate(db);
    }
}
