package com.example.app;

import android.app.Activity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText user = findViewById(R.id.username);
        final EditText pass = findViewById(R.id.password);
        final Button loginButton = findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if( login(user.getText().toString(), pass.getText().toString())){
                Intent intent = new Intent (v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        }
        });
    }

    public boolean login(String user, String pass){
        if(user.equals("homar") && pass.equals("Epsilon1")){
            Toast.makeText(LoginActivity.this, "Bienvenido " + user,Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
