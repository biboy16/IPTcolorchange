package com.example.textcolorchange;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    private TextView welcomeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeText = findViewById(R.id.welcomeText);
        Button greenButton = findViewById(R.id.greenButton);
        Button yellowButton = findViewById(R.id.yellowButton);
        Button redButton = findViewById(R.id.redButton);

        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(Color.GREEN);
            }
        });

        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(Color.YELLOW);
            }
        });

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(Color.RED);
            }
        });
    }

    private void changeColor(int textColor) {
        welcomeText.setTextColor(textColor);
    }

}
