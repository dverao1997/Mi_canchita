package com.app.lacanchita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Campeonato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campeonato);
   }
    public void regresar(View view){
        Intent intent = new Intent(this, PantallaPrincipal.class);
        startActivity(intent);
   }
    public void siguiente(View view){
        Intent intent1 = new Intent(this, Pagos.class);
        startActivity(intent1);
    }
}