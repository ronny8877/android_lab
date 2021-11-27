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

public class Calculator extends AppCompatActivity {
Button calculate ,to_another_calculate;
EditText val_1,val_2;
TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        calculate = (Button) findViewById(R.id.calculate);
        val_1 =findViewById(R.id.value_1);
        val_2 =findViewById(R.id.value_2);
ans = findViewById(R.id.ans);
to_another_calculate = findViewById(R.id.to_simple_calculator);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans.setText("SUpppppp");
                try{
                    int sum=Integer.parseInt(val_1.getText().toString().trim()) + Integer.parseInt(val_2.getText().toString().trim());
                 ans.setText(String.valueOf(sum));

                }catch (Exception e)
                {
                    Log.e("In Calculate method", e.getMessage());
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_LONG);
                }


            }
        });


        to_another_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext() , SimpleCalculator.class));
            }
        });

    }
}