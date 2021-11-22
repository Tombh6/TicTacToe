package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;

import android.os.Bundle;

import android.view.View;

import android.content.Intent;

public class PlayerSetup extends AppCompatActivity {

    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);
//TODO:change the id.player1Name and player2Name
        player1 = findViewById(R.id.editTextTextPersonName);
        player2 = findViewById(R.id.editTextTextPersonName2);
    }

    public void submitButtonClick(View view){
        String player1Name=player1.getText().toString();
        String player2Name=player2.getText().toString();

        Intent intent = new Intent(this, GameDisplay.class);
        intent.putExtra("PLAYER_NAMES",new String[] {player1Name, player2Name});
        startActivity(intent);
    }

}