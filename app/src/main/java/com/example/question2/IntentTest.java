package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IntentTest extends AppCompatActivity {
Button btn1 ,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_test);
            btn1 = findViewById(R.id.implicit);
             btn2 = findViewById(R.id.explicit);
            Bundle extras= getIntent().getExtras();
        Toast.makeText(getApplicationContext(),extras.getString("message"),Toast.LENGTH_LONG).show();

             btn1.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Intent intent=new Intent(Intent.ACTION_VIEW);
                     intent.setData(Uri.parse("http://www.javatpoint.com"));
                     startActivity(intent);

                 }
             });


             btn2.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     startActivity(new Intent(getApplicationContext(), Fragment1.class));

                 }
             });


    }
}