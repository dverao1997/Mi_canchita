package com.app.lacanchita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inicioSesion(View view){
        Intent iniSes = new Intent(this, PantallaPrincipal.class);
        startActivity(iniSes);
    }

    public void registrarse (View view){
        Intent regis = new Intent(this, RegistroUsuario2.class);
        startActivity(regis);
    }
}