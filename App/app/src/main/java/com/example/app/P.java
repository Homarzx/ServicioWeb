package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class P extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p);
        TextView nombre = (TextView) findViewById(R.id.name);
        TextView edad = (TextView) findViewById(R.id.edad);
        TextView correo = (TextView) findViewById(R.id.correo);

        nombre.setText(Administrador.actual.nombre);
        edad.setText(Administrador.actual.edad);
        correo.setText(Administrador.actual.correo);
    }
}
