package com.example.marci.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String res = getIntent().getExtras().getString("resultado");
        TextView tx = (TextView) findViewById(R.id.res);
        tx.setText(res);
    }
}
