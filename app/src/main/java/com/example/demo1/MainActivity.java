package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText n1,n2,ans;
    Button sum,dif,pro,rem,clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.editTextNumber1);
        n2=findViewById(R.id.editTextNumber2);
        ans=findViewById(R.id.editTextAnswer);
        sum=findViewById(R.id.add);
        dif=findViewById(R.id.sub);
        pro=findViewById(R.id.mul);
        rem=findViewById(R.id.div);
        clear=findViewById(R.id.clear);


        sum.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (n1.getText().toString().isEmpty() || n2.getText().toString().isEmpty()) {
                    return;
                }
                int a = Integer.parseInt(n1.getText().toString());
                int b = Integer.parseInt(n2.getText().toString());
                int c = a + b;
                ans.setText(String.valueOf(c));
            }
        });
        dif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n1.getText().toString().isEmpty() || n2.getText().toString().isEmpty()) {
                    return;
                }
                int a = Integer.parseInt(n1.getText().toString());
                int b = Integer.parseInt(n2.getText().toString());
                int c = a - b;
                ans.setText(String.valueOf(c));
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n1.getText().toString().isEmpty() || n2.getText().toString().isEmpty()) {
                    return;
                }
                int a = Integer.parseInt(n1.getText().toString());
                int b = Integer.parseInt(n2.getText().toString());
                int c = a * b;
                ans.setText(String.valueOf(c));
            }
        });
        rem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n1.getText().toString().isEmpty() || n2.getText().toString().isEmpty()) {
                    return;
                }
                double a = Integer.parseInt(n1.getText().toString());
                double b = Integer.parseInt(n2.getText().toString());
                double c = a / b;
                ans.setText(String.valueOf(c));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans.setText("");
                n1.setText("");
                n2.setText("");
            }
        });
    }
}