package com.example.claudia.myactivitiesconect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    EditText Texto;
    Button Enviar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Texto = (EditText) findViewById(R.id.editText);
        Enviar = (Button)findViewById(R.id.button);

        Enviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EnviarDatos();
            }

        });

    }

    private void EnviarDatos(){
        String texto;
        texto = Texto.getText().toString();
        Intent intent = new Intent(Principal.this, Secundaria.class);
        intent.putExtra("Texto",texto);
        startActivity(intent);
    }



}
