package com.cambionombre.leyendas_chilenas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Zona_Sur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona__sur);
    }

    //Metodo De Boton Caleuche
    public void Caleuche(View view) {
        Intent Caleuche = new Intent(this, caleuche.class);
        startActivity(Caleuche);
    }

    //Metodo De Boton Trauco
    public void Trauco(View view) {
        Intent Trauco = new Intent(this, trauco.class);
        startActivity(Trauco);
    }

    //Metodo De Boton Pincoya
    public void Pincoya(View view) {
        Intent Pincoya = new Intent(this, pincoya.class);
        startActivity(Pincoya);
    }
}
