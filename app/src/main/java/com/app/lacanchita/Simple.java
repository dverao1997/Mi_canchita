package com.app.lacanchita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Simple extends AppCompatActivity {

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner);
        String[] canchas = {"Sintetica", "Fut. Sala", "Basket", "Volley"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item_canchas, canchas);
        spinner1.setAdapter(adapter);

        next = findViewById(R.id.button1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Simple.this, Pagos.class);
                startActivity(i);
            }
        });
    }
}