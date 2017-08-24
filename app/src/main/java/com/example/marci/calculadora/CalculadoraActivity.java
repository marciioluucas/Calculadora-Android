package com.example.marci.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        final EditText valor1 = (EditText) findViewById(R.id.valor1);
        final EditText valor2 = (EditText) findViewById(R.id.valor2);
        Button btnSoma = (Button) findViewById(R.id.soma);
        Button btnSubtrai = (Button) findViewById(R.id.subtrai);
        Button btnMultiplica = (Button) findViewById(R.id.multiplica);
        Button btnDivide = (Button) findViewById(R.id.divide);
        final TextView display = (TextView) findViewById(R.id.display);


        btnSoma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String result = String.valueOf(new Calculadora(Float.parseFloat(valor1.getText().toString()), Float.parseFloat(valor2.getText().toString())).somar());
                display.setText(result);
            }
        });
        btnSubtrai.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String result = String.valueOf(new Calculadora(Float.parseFloat(valor1.getText().toString()), Float.parseFloat(valor2.getText().toString())).subtrair());
                display.setText(result);
            }
        });
        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String result = String.valueOf(new Calculadora(Float.parseFloat(valor1.getText().toString()), Float.parseFloat(valor2.getText().toString())).multiplicar());
                display.setText(result);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String result = String.valueOf(new Calculadora(Float.parseFloat(valor1.getText().toString()), Float.parseFloat(valor2.getText().toString())).dividir());
                display.setText(result);
            }
        });
    }
}
