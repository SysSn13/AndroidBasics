package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewCheckBoxBasics;
    private TextView textViewRadioButtonBasics;
    private TextView textViewRatingBarBasics;
    private ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defining variables
        defineVariables();

        progressBar = (ProgressBar) findViewById(R.id.progressbar);

        progressBar.setVisibility(View.INVISIBLE); // To hide the ProgressBar

        textViewCheckBoxBasics.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                //progressBar.setVisibility(View.VISIBLE);// To show the ProgressBar

                startActivity(new Intent(MainActivity.this, Checkbox.class));

            }

        });
        textViewRadioButtonBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RadioButtonBasics.class));
            }
        });
        textViewRatingBarBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RatingBarBasics.class));
            }
        });
    }


//Method of defining variables
        private void defineVariables () {

            textViewCheckBoxBasics = (TextView) findViewById(R.id.tvCheckBoxBasics);
            textViewRadioButtonBasics = (TextView) findViewById(R.id.tvRadioButton_basics);
            textViewRatingBarBasics = (TextView) findViewById(R.id.tvRatingBar_basics);

        }




}
