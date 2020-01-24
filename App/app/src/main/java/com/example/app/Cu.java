package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Cu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cu);

        ImageView a1 = (ImageView) findViewById(R.id.imagen1);
        ImageView a2 = (ImageView) findViewById(R.id.imagen2);
        ImageView a3 = (ImageView) findViewById(R.id.imagen3);


        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("zero");
                abrirActivity(1);
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActivity(2);
            }

        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActivity(3);
            }
        });
    }

    public void abrirActivity(int i){
        if(i == 1){
            MaterialDeterminado.control =1;
        }
        else if (i == 2){
            MaterialDeterminado.control =2;
        }
        else if (i == 3){
            MaterialDeterminado.control =3;
        }
        Intent perfil = new Intent (this,Material.class);
        startActivity(perfil);
    }
}
