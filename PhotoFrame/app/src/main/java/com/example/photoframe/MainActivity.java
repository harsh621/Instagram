package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String [] Name = {"Bill Gates","Harry","Rohit Sharma","SRK","Virat Kohli"};
    ImageButton Previous,Next;
    ImageView pic;
    int CurrentImage = 0;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Previous = findViewById(R.id.Previous);
        Next = findViewById(R.id.Next);
        text = findViewById(R.id.text);

    }
    public void Next(View v){
        text = findViewById(R.id.text);
        String IdX = "Picture" + CurrentImage;
        int x = this.getResources().getIdentifier(IdX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        CurrentImage = (CurrentImage + 1) % 5;

        String IdY = "Picture" + CurrentImage;
        int y = this.getResources().getIdentifier(IdY,"id",getPackageName());
        pic= findViewById(y);
        pic.setAlpha(1f);
        text.setText(Name[CurrentImage]);

    }
    public void Previous(View v){
        text = findViewById(R.id.text);
        String IdX = "Picture" + CurrentImage;
        int x = this.getResources().getIdentifier(IdX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        CurrentImage = (5 + CurrentImage - 1) % 5;

        String IdY = "Picture" + CurrentImage;
        int y = this.getResources().getIdentifier(IdY,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(Name[CurrentImage]);
    }
}