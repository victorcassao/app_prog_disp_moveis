package com.example.noticiando.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.noticiando.objects.Usuario;

import java.security.MessageDigest;
import java.util.Objects;

public class BancoController {
    private SQLiteDatabase db;
    private CriarBanco banco;

    public BancoController(Context context){
        banco = new CriarBanco(context);
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
