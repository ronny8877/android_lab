package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleCalculator extends AppCompatActivity {
EditText value1 ,value2;
Button add,sub,mul,divide,next;
TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        value1  = (EditText) findViewById(R.id.value_1);
         value2  = (EditText) findViewById(R.id.value_2);
         next= findViewById(R.id.next);
         result = findViewById(R.id.result);
 add =  findViewById(R.id.add);
 sub = findViewById(R.id.sub);
 mul = findViewById(R.id.multiply);
 divide = findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum=Integer.parseInt(value1.getText().toString()) + Integer.parseInt(value2.getText().toString());
                result.setText(String.valueOf(sum));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sub=Integer.parseInt(value1.getText().toString()) - Integer.parseInt(value2.getText().toString());
                result.setText(String.valueOf(sub));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mul=Integer.parseInt(value1.getText().toString()) * Integer.parseInt(value2.getText().toString());
                result.setText(String.valueOf(mul));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int div=Integer.parseInt(value1.getText().toString()) / Integer.parseInt(value2.getText().toString());
                result.setText(String.valueOf(div));
            }
        });



next.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(),ImageVieewSimple.class));


    }



});





    }


}