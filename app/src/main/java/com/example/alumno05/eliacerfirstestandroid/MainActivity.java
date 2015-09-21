package com.example.alumno05.eliacerfirstestandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListViewAdapter adapter;

    String[] titulo = new String[]{
            "La Religiosa",
            "El padre pio",
            "Perfecta Obediencia",
            "Santa Rosa de Lima",
    };

    String[] subtitulo = new String[]{
            "Historia que motivo al mundo...",
            "Sacerdote que lucha por los ideales de la iglesia...",
            "Manifestacion de servicio a las cosas de Dios...",
            "Mujer con recato...",
    };

    int[] imagenes = {
            R.drawable.lareligiosa,
            R.drawable.padrepio,
            R.drawable.perfobed,
            R.drawable.lima
    };

    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.listaPeliculas);
        adapter = new ListViewAdapter(this, titulo,subtitulo, imagenes);
        lista.setAdapter(adapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position) {
                    case 0:
                        Intent r = new Intent(MainActivity.this, Religiosa.class);
                        startActivity(r);
                        break;

                    case 1:
                        Intent p = new Intent(MainActivity.this, PadrePio.class);
                        startActivity(p);
                        break;
                    case 2:
                        Intent o = new Intent(MainActivity.this, Obediencia.class);
                        startActivity(o);
                        break;
                    case 3:
                        Intent rosa = new Intent(MainActivity.this, Rosa.class);
                        startActivity(rosa);
                        break;

                }

            }
        });
    }


}
