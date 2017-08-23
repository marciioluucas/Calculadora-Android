package com.example.marci.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display = (TextView) findViewById(R.id.display);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText valor1 = (EditText) findViewById(R.id.valor1);
        final EditText valor2 = (EditText) findViewById(R.id.valor2);
        Button btnSoma = (Button) findViewById(R.id.soma);
        Button btnSubtrai = (Button) findViewById(R.id.subtrair);
        Button btnMultiplica = (Button) findViewById(R.id.multiplicar);
        Button btnDivide = (Button) findViewById(R.id.dividir);



        btnSoma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                display.setText((int) new Calculadora(Float.parseFloat(valor1.getText().toString()), Float.parseFloat(valor2.getText().toString())).somar());
            }
        });
    }

}
