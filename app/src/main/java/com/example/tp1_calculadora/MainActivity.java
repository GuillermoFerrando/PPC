package com.example.tp1_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonSuma = (Button) findViewById(R.id.suma);
        Button botonResta = (Button) findViewById(R.id.resta);
        Button botonDivision = (Button) findViewById(R.id.division);
        Button botonMultiplicacion = (Button) findViewById(R.id.multiplicacion);

        final EditText operandoA = (EditText) findViewById(R.id.operador1) ;
        final EditText operandoB = (EditText) findViewById(R.id.operador2);
        final TextView resultado = (TextView) findViewById(R.id.resultadofinal);

        double total;
        String mostrar;

        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double auxA = Integer.parseInt((operandoA.getText().toString()).trim());
                double auxB = Integer.parseInt((operandoB.getText().toString()).trim());
                double suma = auxA + auxB;
                resultado.setText(String.valueOf(suma));
            }
        });
        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double auxA = Integer.parseInt((operandoA.getText().toString()).trim());
                double auxB = Integer.parseInt((operandoB.getText().toString()).trim());
                double resta = auxA - auxB;
                resultado.setText(String.valueOf(resta));
            }
        });
        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double auxA = Integer.parseInt((operandoA.getText().toString()).trim());
                double auxB = Integer.parseInt((operandoB.getText().toString()).trim());
                double mult = auxA * auxB;
                resultado.setText(String.valueOf(mult));
            }
        });
        botonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double auxA = Integer.parseInt((operandoA.getText().toString()).trim());
                double auxB = Integer.parseInt((operandoB.getText().toString()).trim());
                double div = auxA / auxB;
                resultado.setText(String.valueOf(div));
            }
        });
    }
}
