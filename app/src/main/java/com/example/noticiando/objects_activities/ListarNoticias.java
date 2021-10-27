package com.example.noticiando.objects_activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.noticiando.R;

public class ListarNoticias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_noticias);

        FragmentManager fragmentManager =  getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.fragmentNoticias,new FragmentListaNoticias())
                .commit();

    }
}