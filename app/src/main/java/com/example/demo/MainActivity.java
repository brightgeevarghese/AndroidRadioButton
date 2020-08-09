package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton blue, red, yellow;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blue = findViewById(R.id.blueId);
        red = findViewById(R.id.redId);
        yellow = findViewById(R.id.yellowId);
        linearLayout = findViewById(R.id.linearId);

        //Register blue radiobutton with event listener
        blue.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //change the background color to blue if blue button is checked
                if (b){
                    linearLayout.setBackgroundColor(Color.BLUE);
                    //change the text color of radiobuttons(red, blue & yellow) to white
                    red.setTextColor(Color.WHITE);
                    blue.setTextColor(Color.WHITE);
                    yellow.setTextColor(Color.WHITE);
                }
            }
        });

        //Register red button with event listener
        red.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //change the background color to red, if red button is checked
                if (b){
                    linearLayout.setBackgroundColor(Color.RED);
                    //change the text color of all radiobuttons
                    red.setTextColor(Color.BLACK);
                    blue.setTextColor(Color.BLACK);
                    yellow.setTextColor(Color.BLACK);
                }
            }
        });

        //Register yellow button with event listener
        yellow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //change the background color to yellow, if yellow button is clicked
                if (b){
                    linearLayout.setBackgroundColor(Color.YELLOW);
                    //change the text color of all radiobuttons
                    red.setTextColor(Color.BLACK);
                    blue.setTextColor(Color.BLACK);
                    yellow.setTextColor(Color.BLACK);
                }
            }
        });
    }
}