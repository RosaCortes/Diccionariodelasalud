package com.example.diccionariorosacortes.diccionariodelasalud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class dicinicial extends AppCompatActivity {
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicinicial);
        siguiente = (Button) findViewById(R.id.btnentrar);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(dicinicial.this, dicsegund.class);
                startActivity(siguiente);

            }
        });

    }
}
