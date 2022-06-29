package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText display;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndot,btnC,btnadd,btnsub,btnmul,btndiv,btneql;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnC = (Button) findViewById(R.id.btnC);
        btndot = (Button) findViewById(R.id.btndot);
        btneql = (Button) findViewById(R.id.btneql);

        display =(EditText) findViewById(R.id.display);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("9");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("+");
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("-");
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("x");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("/");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(".");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("");
            }
        });
        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = display.getText().toString();
                if (data.contains("-")){
                    String operands[] = data.split("-");
                    double op1 = Double.parseDouble((operands[0]));
                    double op2 = Double.parseDouble(operands[1]);
                    double res = op1- op2;
                    display.setText(String.valueOf(res));

                }
                if (data.contains("+")){
                    String operands[] = data.split(Pattern.quote("+"));
                    double op1 = Double.parseDouble((operands[0]));
                    double op2 = Double.parseDouble(operands[1]);
                    double res = op1+op2;
                    display.setText(String.valueOf(res));

                }
                if (data.contains("x")){
                    String operands[] = data.split("x");
                    double op1 = Double.parseDouble((operands[0]));
                    double op2 = Double.parseDouble(operands[1]);
                    double res = op1*op2;
                    display.setText(String.valueOf(res));

                }
                if (data.contains("/")){
                    String operands[] = data.split("/");
                    double op1 = Double.parseDouble((operands[0]));
                    double op2 = Double.parseDouble(operands[1]);
                    if(op2==0){
                        Toast.makeText(MainActivity.this, "Divide By Zero is Not Possible", Toast.LENGTH_SHORT).show();
                    }
                    double res = op1/op2;
                    display.setText(String.valueOf(res));

                }
            }
        });

    }
}