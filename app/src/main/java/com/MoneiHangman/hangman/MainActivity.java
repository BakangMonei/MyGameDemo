package com.MoneiHangman.hangman;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button guessButton = (Button) findViewById(R.id.guessButton);
        TextView mainTV = (TextView) findViewById(R.id.mainTV);
        TextView HangManLogo = (TextView) findViewById(R.id.HangManLogo);


        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                String guessWord = random.toString();

                mainTV.setText("Guessed word: " + guessWord);
            }
        });
    }
}