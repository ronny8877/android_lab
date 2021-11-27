package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArrayAdp extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adp);
   listView = findViewById(R.id.list);

   String[] arr ={"Ronnie","Is","a ","Good","Boi"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, R.layout.activity_array_adp,arr);
        listView.setAdapter(adapter);


        SQLiteDatabase mydatabase = openOrCreateDatabase("your database name",MODE_PRIVATE,null);
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS TutorialsPoint(Username VARCHAR,Password VARCHAR);");
        mydatabase.execSQL("INSERT INTO TutorialsPoint VALUES('admin','admin');");
    }
}