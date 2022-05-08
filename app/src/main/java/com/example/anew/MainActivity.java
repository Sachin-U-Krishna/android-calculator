package com.example.anew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSum, btnMul;
    EditText num1, num2, num3;
    double res,n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.txt1);
        num2 = (EditText) findViewById(R.id.txt2);
        num3 = (EditText) findViewById(R.id.txtResult);

        btnSum = (Button) findViewById(R.id.btnSum);
        btnMul = (Button) findViewById(R.id.btnMul);

//      importing onClickListener and using setOnClickListener
        btnSum.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());
                res = n1 + n2;
                num3.setText(String.valueOf(res));
            }
        });

        btnMul.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());
                res = n1 * n2;
                num3.setText(String.valueOf(res));
            }
        });

    }

//    Using onClick Event in XML layout
    public void subtract(View view){
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        res = n1 - n2;
        num3.setText(String.valueOf(res));
    }

    public void divide(View view){
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        res = n1 / n2;
        num3.setText(String.valueOf(res));
    }
}