package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declarando variables
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir, btnLimpiar, btnResultado, btnBorrar;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    TextView txtVista;
    float numero1=0.0f;
    float numero2=0.0f;
    String operacion ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //=========================================================
        //              Asignando botones a las variables
        //=========================================================

        //=================Botones Operaciones=============
        btnSumar = (Button)findViewById(R.id.btnSumar);
        btnRestar = (Button)findViewById(R.id.btnRestar);
        btnMultiplicar = (Button)findViewById(R.id.btnMultiplicar);
        btnDividir = (Button)findViewById(R.id.btnDividir);
        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnResultado = (Button)findViewById(R.id.btnResultado);
        btnBorrar = (Button)findViewById(R.id.btnBorrar);

        //=================Botones Numeros=============
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);

        //=================  Textos  =============
        txtVista = (TextView)findViewById(R.id.vista);
        txtVista.setText("0");

        //=========================================================
        //              Asignando metodos a cada boton
        //=========================================================

        //0
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("0");
                }else {
                    txtVista.setText(txtVista.getText()+"0");
                }
            }
        });
        //1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("1");
                }else {
                    txtVista.setText(txtVista.getText()+"1");
                }
            }
        });
        //2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("2");
                }else {
                    txtVista.setText(txtVista.getText()+"2");
                }
            }
        });
        //3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("3");
                }else {
                    txtVista.setText(txtVista.getText()+"3");
                }
            }
        });
        //4
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("4");
                }else {
                    txtVista.setText(txtVista.getText()+"4");
                }
            }
        });
        //5
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("5");
                }else {
                    txtVista.setText(txtVista.getText()+"5");
                }
            }
        });
        //6
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("6");
                }else {
                    txtVista.setText(txtVista.getText()+"6");
                }
            }
        });
        //7
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("7");
                }else {
                    txtVista.setText(txtVista.getText()+"7");
                }
            }
        });
        //8
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("8");
                }else {
                    txtVista.setText(txtVista.getText()+"8");
                }
            }
        });
        //9
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("9");
                }else {
                    txtVista.setText(txtVista.getText()+"9");
                }
            }
        });

        //=========================================================
        //             Asignando metodos a las operaciones
        //=========================================================

        //Limpiar
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVista.setText("0");
                numero1=0.0f;
                numero2=0.0f;
                operacion ="";
            }
        });

        //Sumar
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                operacion="+";
                txtVista.setText("0");
            }
        });
        //Restar
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                operacion="-";
                txtVista.setText("0");
            }
        });
        //Multiplicar
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                operacion="*";
                txtVista.setText("0");
            }
        });
        //Dividir
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                operacion="/";
                txtVista.setText("0");
            }
        });

        //Mostrar Resultado Vista
        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero2=Float.parseFloat(txtVista.getText().toString());
                if (operacion.equals("+")){
                    float result = numero1+numero2;
                    txtVista.setText(result+"");

                }else if(operacion.equals("-")){
                    float result = numero1-numero2;
                    txtVista.setText(result+"");

                }else if(operacion.equals("*")){
                    float result = numero1*numero2;
                    txtVista.setText(result+"");

                }else if(operacion.equals("/")){
                    if (numero2==0.0f){
                        txtVista.setText("");
                    }else {
                        float result = numero1/numero2;
                        txtVista.setText(result+"");
                    }
                }

                numero1=0.0f;
                numero2=0.0f;
                operacion ="";
            }
        });
    }

}