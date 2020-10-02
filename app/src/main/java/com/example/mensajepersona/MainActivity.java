package com.example.mensajepersona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public static final String NOMBRE_PERSONA = "NOMBRE_PERSONA";
    private EditText etNombrePersona;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setDatos();

    }
    public void setDatos(){
        etNombrePersona = findViewById(R.id.etNombrePersona);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MensajeActivity.class);
                Bundle message = new Bundle();
                message.putString(NOMBRE_PERSONA, etNombrePersona.getText().toString());
                intent.putExtras(message);
                startActivity(intent);
            }
        });
    }
}