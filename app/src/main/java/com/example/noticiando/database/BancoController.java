package com.example.noticiando.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.noticiando.objects.Usuario;

import java.util.Objects;

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


    public boolean autenticaUsuario(String usuario, String senha) {
        db = banco.getReadableDatabase();
        String sql_busca_pessoas = "SELECT * FROM usuario WHERE username = " + "'" + usuario + "'";
        Cursor c = db.rawQuery(sql_busca_pessoas, null);
        while (c.moveToNext()) {
            Log.d("logwhile", c.getString(3));
            if (Objects.equals(senha, c.getString(3))) {
                Log.d("senha", "deucertoautenticar");
                return true;
            }else {
                Log.d("senha1", "naocertoautenticar");
                return false;
            }
        }

        c.close();
        return false;
    }

}
