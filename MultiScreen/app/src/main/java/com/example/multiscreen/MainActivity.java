package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.example.multiscreen.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OrderFood(View v){
        Intent intent = new Intent(MainActivity.this,OrderActivity.class);
        EditText Item1 = findViewById(R.id.editTextTextPersonName);
        EditText Item2 = findViewById(R.id.editTextTextPersonName2);
        EditText Item3 = findViewById(R.id.editTextTextPersonName3);
        String message = "You Have Ordered "+Item1.getText().toString()+" , "+Item2.getText().toString()+" , "+Item3.getText().toString();
        intent.putExtra(MSG,message);
        startActivity(intent);

    }
}