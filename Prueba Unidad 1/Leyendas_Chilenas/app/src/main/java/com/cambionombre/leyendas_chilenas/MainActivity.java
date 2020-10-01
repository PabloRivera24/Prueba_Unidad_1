package com.cambionombre.leyendas_chilenas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Button Programador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }

    //Metodo De Boton Vamos
    public void Vamos(View view){
        Intent vamos = new Intent(this,Menu.class);
        startActivity(vamos);


    }
}
