package com.example.claudia.myactivitiesconect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {

    TextView Texto;
    String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        Texto = (TextView) findViewById(R.id.campoMostrar);
        Bundle bundle = this.getIntent().getExtras();
        texto = bundle.getString("Texto");

        Texto.setText(texto);
    }
}
