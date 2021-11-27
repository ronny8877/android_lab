package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ImageVieewSimple extends AppCompatActivity {
android.widget.ImageView img;
    Button button, next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_vieew_simple);
       img=findViewById(R.id.iV);
     button =  findViewById(R.id.change_btn);
   next = findViewById(R.id.next_activity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            img.setImageResource(R.drawable._19522);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext() ,IntentTest.class);
                i.putExtra("message", "sending a message");
                startActivity(i);
            }
        });

    }
}