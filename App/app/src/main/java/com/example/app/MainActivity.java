package com.example.app;



import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(Administrador.actual);

        dl = (DrawerLayout)findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.perfil:
                        Toast.makeText(MainActivity.this, "My Account",Toast.LENGTH_SHORT).show();
                        abrirActivity(1);break;
                    case R.id.curso:
                        Toast.makeText(MainActivity.this, "Settings",Toast.LENGTH_SHORT).show();abrirActivity(2);break;
                    case R.id.material:
                        Toast.makeText(MainActivity.this, "Material",Toast.LENGTH_SHORT).show();abrirActivity(3);break;
                    default:
                        return true;
                }


                return true;

            }
        });


    }

    public void abrirActivity(int i){
        if(i == 1){
            Intent perfil = new Intent (this,P.class);
            startActivity(perfil);
        }
        else if (i == 2){
            Intent perfil = new Intent (this,Cu.class);
            startActivity(perfil);
        }
        else if (i == 3){
            MaterialDeterminado.control = 0;
            Intent perfil = new Intent (this,Material.class);
            startActivity(perfil);
        }
    }

    @Override

    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
}
