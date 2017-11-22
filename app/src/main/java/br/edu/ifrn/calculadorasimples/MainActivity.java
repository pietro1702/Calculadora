package br.edu.ifrn.calculadorasimples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    EditText edR;
    Button btSoma;
    Button btSub;
    Button btMult;
    Button btDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.editTextValor1);
        ed2 = (EditText) findViewById(R.id.editTextValor2);
        edR = (EditText) findViewById(R.id.editTextResultado);
        btSoma = (Button) findViewById(R.id.buttonSoma);
        btSub = (Button) findViewById(R.id.buttonSub);
        btMult = (Button) findViewById(R.id.buttonMult);
        btDiv = (Button) findViewById(R.id.buttonDiv);

        //Ação para o botão "Soma"
        btSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double v1;
                Double v2;
                Double res;
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                res = v1+v2;
                edR.setText(res.toString());
            }
        });

        // Ação para o botação "Subtração"
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double v1;
                Double v2;
                Double res;
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                res = v1-v2;
                edR.setText(res.toString());
            }
        });

        // Ação para o botão "Multiplicação"
        btMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double v1;
                Double v2;
                Double res;
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                res = v1*v2;
                edR.setText(res.toString());
            }
        });

       // Ação para o botão "Divisão"
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double v1;
                Double v2;
                Double res;
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                res = v1/v2;
                edR.setText(res.toString());
            }
        });
    }
}
