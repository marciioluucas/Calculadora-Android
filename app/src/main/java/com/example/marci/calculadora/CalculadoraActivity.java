package com.example.marci.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.marci.calculadora.R.id.display;

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


        btnSoma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mudaTela(String.valueOf(new Calculadora(Float.parseFloat(valor1.getText().toString()), Float.parseFloat(valor2.getText().toString())).somar()));

            }
        });
        btnSubtrai.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mudaTela(String.valueOf(new Calculadora(Float.parseFloat(valor1.getText().toString()), Float.parseFloat(valor2.getText().toString())).subtrair()));
            }
        });
        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mudaTela(String.valueOf(new Calculadora(Float.parseFloat(valor1.getText().toString()), Float.parseFloat(valor2.getText().toString())).multiplicar()));

            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mudaTela(String.valueOf(new Calculadora(Float.parseFloat(valor1.getText().toString()), Float.parseFloat(valor2.getText().toString())).dividir()));
            }
        });
    }

    private void mudaTela(String result) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("resultado", result);
        startActivity(intent);
    }
}
