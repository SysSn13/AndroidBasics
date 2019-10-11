package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.Toast;

public class ClockBasics extends AppCompatActivity {
    private static Button swapClockButton,showTimeButton;
    private static DigitalClock digitalClock;
    private static AnalogClock analogClock;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_basics);
        onButtonClickListener();
        onShowTimeButtonClickListener();
        // inititate the digital and analog clock
        digitalClock = (DigitalClock) findViewById(R.id.simpleDigitalClock);
        analogClock = (AnalogClock) findViewById(R.id.simpleAnalogClock);
        // perform click event on analog clock
        analogClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ClockBasics.this, "Analog Clock", Toast.LENGTH_SHORT).show(); // display a toast for analog clock
            }
        });
        // perform click event on digital clock
        digitalClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ClockBasics.this, "Digital Clock", Toast.LENGTH_SHORT).show(); //display a toast for digital clock
            }
        });
    }
    public void onButtonClickListener(){
        swapClockButton = (Button)findViewById(R.id.button_swapClock_clock_basics);
        digitalClock=(DigitalClock)findViewById(R.id.simpleDigitalClock);
        analogClock  =( AnalogClock)findViewById(R.id.simpleAnalogClock);
        swapClockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(digitalClock.getVisibility()==digitalClock.INVISIBLE){
                    digitalClock.setVisibility(View.VISIBLE);
                    analogClock.setVisibility(View.INVISIBLE);}

                else{
                    analogClock.setVisibility(View.VISIBLE);
                    digitalClock.setVisibility(View.INVISIBLE);

                }
            }
        });

    }
    public void onShowTimeButtonClickListener(){
        showTimeButton =(Button) findViewById(R.id.button_showTime_clock_basics);
        digitalClock=(DigitalClock)findViewById(R.id.simpleDigitalClock);
        showTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String time = digitalClock.getText().toString();

            Toast.makeText(ClockBasics.this,"Time is: "+time,Toast.LENGTH_SHORT).show();
            }


        });

    }

}
