package com.example.mensajepersona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MensajeActivity extends AppCompatActivity {

    TextView tvNombrePersona;
    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        setDatos();

    }

    private void setDatos() {
        tvNombrePersona = findViewById(R.id.tvNombreRecibe);
        btnRegresar = findViewById(R.id.btnRegresar);

        Bundle extras = getIntent().getExtras();
        String nombrePersona = extras.getString("NOMBRE_PERSONA");
        if( nombrePersona != null ) {
            tvNombrePersona.setText(nombrePersona + "");
        }

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MensajeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }



}