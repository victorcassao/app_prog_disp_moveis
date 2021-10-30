package com.example.noticiando.objects_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.noticiando.R;

public class SelecionaCategoriaActivity extends AppCompatActivity {

    CheckBox categoria_geral;
    CheckBox categoria_esportes;
    CheckBox categoria_tecnologia;
    CheckBox categoria_saude;
    CheckBox categoria_entreterimento;
    CheckBox categoria_ciencia;
    CheckBox categoria_negocios;
    Button botao_aplica_categoria;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleciona_categoria);

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
            }
        });

    }











}