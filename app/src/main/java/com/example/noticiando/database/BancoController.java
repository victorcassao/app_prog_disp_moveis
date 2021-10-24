package com.example.noticiando.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.noticiando.objects.Usuario;

public class BancoController {
    private SQLiteDatabase db;
    private CriarBanco banco;

    public BancoController(Context context){
        banco = new CriarBanco(context);
    }

    public Boolean insereDadoUsuario(Usuario pessoa) {
        db = banco.getWritableDatabase();
        ContentValues valores;
        long resultado;
        valores = new ContentValues();

        valores.put(CriarBanco.NOME_USUARIO, pessoa.getNome());
        valores.put(CriarBanco.USERNAME, pessoa.getUser());
        valores.put(CriarBanco.SENHA_USUARIO, pessoa.getSenha());
        valores.put(CriarBanco.ISADMINISTRATOR, pessoa.isAdministrator());
        valores.put(CriarBanco.ISACTIVE, pessoa.isActive());

        resultado = db.insert(CriarBanco.TABELA_USUARIO, null, valores);


        if (resultado == -1) {
//            Log.d("erro_ao_inserir", "O dado não foi inserido, amigo." + resultado);
            return false;
        } else {
//            Log.d("sucesso_ao_inserir", "O dado foi inserido, amigo.");
            return true;
        }
    }



}
