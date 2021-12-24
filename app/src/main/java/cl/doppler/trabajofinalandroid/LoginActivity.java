package cl.doppler.trabajofinalandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button botoN;
    private EditText etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etNombre=(EditText) findViewById(R.id.etUsuario);
        botoN =(Button) findViewById(R.id.btSig);

        Intent intent = new Intent(this, MainActivity.class);

        botoN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("usuario", etNombre.getText().toString());
                startActivity(intent);
            }
        });

    }
}