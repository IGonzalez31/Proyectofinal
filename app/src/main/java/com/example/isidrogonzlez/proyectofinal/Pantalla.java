package com.example.isidrogonzlez.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pantalla extends AppCompatActivity {
    TextView tv_registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla);
        tv_registrar= (TextView) findViewById(R.id.tv_registrar);

        tv_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentReg = new Intent(Pantalla.this,Registro.class);
                Pantalla.this.startActivities(intentReg);
            }
        });
    }

    private void startActivities(Intent intentReg) {
    }

}
