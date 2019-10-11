package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView textViewCheckBoxBasics;
    private TextView textViewRadioButtonBasics;
    private TextView textViewRatingBarBasics;
    private TextView textViewAlertDialogBasics;
    private TextView textViewClockBasics;
    private TextView textViewListViewBasics;
    private TextView textViewSeekBarBasics;
    private TextView textViewWebViewBasics;
    private TextView textViewGesturesBasics;
    private TextView textViewFragmentsBasics;
    private TextView textViewAutoCompleteTextViewBasics;


    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defining variables
        defineVariables();

        progressBar = (ProgressBar) findViewById(R.id.progressbar);

        progressBar.setVisibility(View.INVISIBLE); // To hide the ProgressBar

        setOnclickListeners();



    }


    //Method of defining variables
    private void defineVariables() {

        textViewCheckBoxBasics = (TextView) findViewById(R.id.tvCheckBoxBasics);
        textViewRadioButtonBasics = (TextView) findViewById(R.id.tvRadioButton_basics);
        textViewRatingBarBasics = (TextView) findViewById(R.id.tvRatingBar_basics);
        textViewAlertDialogBasics = (TextView) findViewById(R.id.tvAlertDialog_basics);
        textViewClockBasics = (TextView) findViewById(R.id.tvClock_basics);
        textViewListViewBasics = (TextView) findViewById(R.id.tvListView_basics);
        textViewSeekBarBasics = (TextView) findViewById(R.id.tvSeekBar_basics);
        textViewWebViewBasics = (TextView) findViewById(R.id.tvWebView_basics);
        textViewGesturesBasics =(TextView) findViewById(R.id.tv_android_gestures_basics);
        textViewFragmentsBasics =(TextView) findViewById(R.id.tv_fragments_basics);
        textViewAutoCompleteTextViewBasics =(TextView)  findViewById(R.id.tv_auto_complete_textView_basics);




    }

    private void setOnclickListeners() {

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
        textViewAlertDialogBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AlertDialogBasics.class));
            }
        });
        textViewClockBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ClockBasics.class));
            }
        });
        textViewListViewBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ListViewBasics.class));
            }
        });
        textViewSeekBarBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SeekBarBasics.class));
            }
        });
        textViewWebViewBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WebViewBasics.class));
            }
        });
        textViewGesturesBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AndroidGesturesActivity.class));
            }
        });
        textViewFragmentsBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FragmentsBasicsActivity.class));
            }
        });
        textViewAutoCompleteTextViewBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AutoCompleteTextViewActivity.class));
            }
        });





    }


}
