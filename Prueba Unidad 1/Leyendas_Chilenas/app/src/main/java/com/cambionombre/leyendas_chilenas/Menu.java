package com.cambionombre.leyendas_chilenas;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;


public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    //Metodo De Boton Zona Norte
    public void Norte(View view) {
        Intent Norte = new Intent(this, Zona_Norte.class);
        startActivity(Norte);
    }

    //Metodo De Boton Zona Centro
    public void Centro(View view) {
        Intent Centro = new Intent(this, Zona_Centro.class);
        startActivity(Centro);
    }

    //Metodo De Boton Zona Sur
    public void Sur(View view) {
        Intent Sur = new Intent(this, Zona_Sur.class);
        startActivity(Sur);
    }
}