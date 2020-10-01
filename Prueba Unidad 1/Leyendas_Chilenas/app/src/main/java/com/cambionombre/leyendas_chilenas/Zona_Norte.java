package com.cambionombre.leyendas_chilenas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Zona_Norte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona__norte);
    }

    //Metodo De Boton Alicanto
    public void Alicanto(View view) {
        Intent Alicanto = new Intent(this, alicanto.class);
        startActivity(Alicanto);
    }

    //Metodo De Boton Lola
    public void Lola(View view) {
        Intent Lola = new Intent(this, lola.class);
        startActivity(Lola);
    }

    //Metodo De Boton Yastay
    public void Yastay(View view) {
        Intent Yastay = new Intent(this, yastay.class);
        startActivity(Yastay);
    }
}
