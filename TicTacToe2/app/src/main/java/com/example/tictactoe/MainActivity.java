package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean gameActive = true;
    private int activePlayer = 0;
 private int[] gameState = {2,2,2,2,2,2,2,2,2};
 private int[][]WinningPosition = {{0,1,2},{3,4,5},{6,7,8},
                                   {0,3,6},{1,4,7},{2,5,8},
                                   {0,4,8},{2,4,6}};

    public void tap(View view){
        TextView status = findViewById(R.id.status);
        ImageView img = (ImageView) view;
        int tappedImage = Integer.parseInt(img.getTag().toString());
        if(!gameActive){
            reset();
        }
        if (gameState[tappedImage] == 2) {
            gameState[tappedImage] = activePlayer;
            img.setTranslationY(-1000f);
            if (activePlayer == 0) {
                img.setImageResource(R.drawable.x);
                activePlayer = 1;
                status.setText("O's Turn Tap");

            } else {
                img.setImageResource(R.drawable.o);
                activePlayer = 0;
                TextView Status = findViewById(R.id.status);
                status.setText("X's Turn Tap");
            }


            img.animate().translationYBy(1000f).setDuration(300);
        }
        for(int[]winPosition:WinningPosition){
            if (gameState[winPosition[0]] == gameState[winPosition[1]] && gameState[winPosition[1]] == gameState[winPosition[2]] && gameState[winPosition[0]] != 2){
              String Winner;
              gameActive = false;
              if (gameState[winPosition[0]] ==0){
                  Winner = "X has WON!";
                  status.setText("X has WON!");
                  Toast.makeText(getApplicationContext(),Winner,Toast.LENGTH_LONG).show();
              }else{
                  Winner = "O has WON!";
                  status.setText("O has WON!");
                  Toast.makeText(getApplicationContext(),Winner,Toast.LENGTH_LONG).show();
              }

            }
        }
    }
    public void reset(){
    gameActive = true;
    activePlayer = 0;
    gameState = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2};
        ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}