package com.example.pc.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView a;
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bC, bAdd, bSub, bMul, bDiv, bDot, bEquals;
    private double var1, var2, var3;
    private boolean add, sub, mul, div = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bAdd = findViewById(R.id.bAdd);
        bSub = findViewById(R.id.bSUB);
        bDiv = findViewById(R.id.bDIV);
        bMul = findViewById(R.id.bMUL);
        bDot = findViewById(R.id.bDOT);
        bC = findViewById(R.id.bC);
        bEquals = findViewById(R.id.bEquals);
        a = findViewById(R.id.t);
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText(a.getText() + "1");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText(a.getText() + "0");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText(a.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText(a.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText(a.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText(a.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText(a.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText(a.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText(a.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText(a.getText() + "9");
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText(a.getText() + ".");
            }
        });
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter some value", Toast.LENGTH_LONG).show();
                } else {
                    var1 = Double.parseDouble(a.getText() + "");
                    add = true;
                    a.setText(null);
                }
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter some value", Toast.LENGTH_LONG).show();

                } else {
                    var1 = Double.parseDouble(a.getText() + "");
                    sub = true;
                    a.setText(null);
                }
            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter some value", Toast.LENGTH_LONG).show();

                } else {
                    var1 = Double.parseDouble(a.getText() + "");
                    mul = true;
                    a.setText(null);
                }
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter some value", Toast.LENGTH_LONG).show();

                } else {
                    var1 = Double.parseDouble(a.getText() + "");
                    div = true;
                    a.setText(null);
                }
            }
        });
        bEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter some value", Toast.LENGTH_LONG).show();
                } else if (add) {
                    var2 = Double.parseDouble(a.getText() + "");
                    var3 = var1 + var2;
                    a.setText("(" + var1 + " + " + var2 + ")");
                    Toast.makeText(MainActivity.this, "RESULT IS : " + var3, Toast.LENGTH_LONG).show();
                    add = false;
                } else if (sub) {
                    var2 = Double.parseDouble(a.getText() + "");
                    var3 = var1 - var2;
                    a.setText("(" + var1 + " - " + var2 + ")");
                    Toast.makeText(MainActivity.this, "RESULT IS : " + var3, Toast.LENGTH_LONG).show();
                    sub = false;
                } else if (mul) {
                    var2 = Double.parseDouble(a.getText() + "");
                    var3 = var1 * var2;
                    a.setText("(" + var1 + " * " + var2 + ")");
                    Toast.makeText(MainActivity.this, "RESULT IS : " + var3, Toast.LENGTH_LONG).show();
                    mul = false;
                } else if (div) {
                    var2 = Double.parseDouble(a.getText() + "");
                    var3 = var1 / var2;
                    a.setText("(" + var1 + " / " + var2 + ")");
                    Toast.makeText(MainActivity.this, "RESULT IS : " + var3, Toast.LENGTH_LONG).show();
                    div = false;
                }
            }
        });
    }
}
