package com.app.lacanchita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PantallaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);
    }
    /*public void campe(View view){
        Intent campeo = new Intent(this, )
    }

    public void partidoS(View view){
        Intent parSim = new Intent(this, )
    }

    public void verActi(View view){
        Intent veActividad = new Intent(this, )
    }*/

    public void Home(View view){
        Intent casa = new Intent(this, MainActivity.class);
        startActivity(casa);
    }

}