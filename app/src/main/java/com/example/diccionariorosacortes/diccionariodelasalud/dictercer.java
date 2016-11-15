package com.example.diccionariorosacortes.diccionariodelasalud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dictercer extends AppCompatActivity {

    EditText et1,et2;
    TextView tv3;
    
    Button pasar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictercer);

        pasar = (Button) findViewById(R.id.btnenter);
        pasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(dictercer.this, diccuarta.class);
                startActivity(siguiente);
            }
        });


        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        tv3 = (TextView) findViewById(R.id.textView4);

    }
    public void ejecutar (View v){
        tv3.setText(et1.getText().toString()+ "  " +et2.getText().toString());
    }

}
