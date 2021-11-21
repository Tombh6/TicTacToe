package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.content.Intent;

public class GameDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_display);
    }
    public void playAgainButtonClick(View view){
        //do fancy stuff
    }

    public void homeButtonClick(View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);

    }

}