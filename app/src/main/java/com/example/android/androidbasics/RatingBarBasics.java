package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RatingBarBasics extends AppCompatActivity {
    private Button submit;
    private RatingBar ratingBar;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar_basics);
        onClickListenerForRatingBar();
        onClickListenerForButtonSubmit();
    }
    public void onClickListenerForRatingBar(){
        ratingBar =(RatingBar) findViewById(R.id.ratingBar);
        textView = (TextView) findViewById(R.id.textViewForRatingBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                textView.setText(" Your selected rating is: "+ v);
            }
        });
    }
    public void onClickListenerForButtonSubmit(){
        ratingBar =(RatingBar) findViewById(R.id.ratingBar);
        submit =(Button) findViewById(R.id.button_submit_ratingBar);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RatingBarBasics.this,String.valueOf(ratingBar.getRating()),Toast.LENGTH_SHORT).show();
            }
        });
    }

}
