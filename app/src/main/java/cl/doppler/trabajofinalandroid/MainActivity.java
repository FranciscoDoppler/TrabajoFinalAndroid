package cl.doppler.trabajofinalandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mapa,btGuardar;
    private String Nombre;
    private TextView tvUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUsuario = (TextView)findViewById(R.id.tvUsuario);
        mapa = (Button)findViewById(R.id.mapa);
        btGuardar = (Button)findViewById(R.id.btGuardar);

        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        Intent intent2 = new Intent(MainActivity.this, GuardarActivity.class);

        Context context=getApplicationContext();

        Bundle intentN=this.getIntent().getExtras();
        if(intentN!=null){
            Nombre=intentN.getString("usuario");
        }

        tvUsuario.setText("Bienvenido Usuario: " + Nombre);

        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }

        });

        btGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);

            }
        });

    }
}