package com.example.noticiando.objects_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.noticiando.R;
import com.example.noticiando.database.BancoController;
import com.example.noticiando.objects.Usuario;

public class SelecionaCategoriaActivity extends AppCompatActivity {

    CheckBox categoria_geral;
    CheckBox categoria_esportes;
    CheckBox categoria_tecnologia;
    CheckBox categoria_saude;
    CheckBox categoria_entreterimento;
    CheckBox categoria_ciencia;
    CheckBox categoria_negocios;
    Button botao_aplica_categoria;
    BancoController db = new BancoController(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleciona_categoria);
        TextView mostra_nome_usuario = findViewById(R.id.usuarioLogado);
        Intent intent = getIntent();
        Usuario user = (Usuario) intent.getSerializableExtra("usuario");

        mostra_nome_usuario.setText(user.getNome());

        categoria_geral = findViewById(R.id.categoria_geral);
        categoria_esportes = findViewById(R.id.categoria_esportes);
        categoria_tecnologia = findViewById(R.id.categoria_tecnologia);
        categoria_saude = findViewById(R.id.categoria_saude);
        categoria_entreterimento = findViewById(R.id.categoria_entreterimento);
        categoria_ciencia = findViewById(R.id.categoria_ciencia);
        categoria_negocios = findViewById(R.id.categoria_negocios);

        botao_aplica_categoria = findViewById(R.id.botao_aplica_categoria);

        botao_aplica_categoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListarNoticias.class);

                if(categoria_esportes.isChecked()){
                    db.insereUsuarioCategoria(user,1);
                };
                if(categoria_tecnologia.isChecked()){
                    db.insereUsuarioCategoria(user,2);
                };
                if(categoria_ciencia.isChecked()){
                    db.insereUsuarioCategoria(user,3);
                };
                if(categoria_entreterimento.isChecked()){
                    db.insereUsuarioCategoria(user,4);
                };
                if(categoria_geral.isChecked()){
                    db.insereUsuarioCategoria(user,5);
                };

                if(categoria_negocios.isChecked()){
                    db.insereUsuarioCategoria(user,6);
                };

                if(categoria_saude.isChecked()){
                    db.insereUsuarioCategoria(user,7);
                };

                db.atualizaFlagCategoriaNoticia(user);

                Intent intent2 = new Intent(getApplicationContext(), ListarNoticias.class);
                intent2.putExtra("usuario",user);
                startActivity(intent2);

            }
        });

    }











}