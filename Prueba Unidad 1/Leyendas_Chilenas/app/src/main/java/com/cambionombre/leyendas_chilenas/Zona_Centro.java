package com.cambionombre.leyendas_chilenas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Zona_Centro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona__centro);
    }

    //Metodo De Boton Rubia
    public void Rubia(View view) {
        Intent Rubia = new Intent(this, rubia.class);
        startActivity(Rubia);
    }

    //Metodo De Boton Novia
    public void Novia(View view) {
        Intent Novia = new Intent(this, novia.class);
        startActivity(Novia);
    }

    //Metodo De Boton Chonchon
    public void Chonchon(View view) {
        Intent Chonchon = new Intent(this, chonchon.class);
        startActivity(Chonchon);
    }
}
