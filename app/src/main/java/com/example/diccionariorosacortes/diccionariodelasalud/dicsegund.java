package com.example.diccionariorosacortes.diccionariodelasalud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class dicsegund extends AppCompatActivity {
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicsegund);
        login = (Button) findViewById(R.id.regis);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(dicsegund.this, dictercer.class);
                startActivity(siguiente);

            }
        });

    }
}

