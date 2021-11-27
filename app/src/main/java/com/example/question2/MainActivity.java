package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
 EditText change_color;
 RelativeLayout main_layout;
 Button color_change_btn ,change_bg_color ,to_calculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_layout = findViewById(R.id.Main_background);
        change_color = findViewById(R.id.change_color);
        color_change_btn = findViewById(R.id.change_color_btn);
       change_bg_color = findViewById(R.id.change_bg_color_btn);
       to_calculator= findViewById(R.id.to_calculator);
        color_change_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change_color.setBackground(getDrawable(R.color.purple_700));
                Log.d("lifecycle","Works till now");
            }
        });

        change_bg_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    main_layout.setBackgroundColor(getResources().getColor(R.color.purple_500));
                }
                catch (Exception ex)
                {
                    Log.e("error", ex.getMessage());
                }

            }
        });

        to_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"TO calculator",Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(),Calculator.class));
            }
        });

    }

    //end of class.....
}