package com.example.android.androidbasics;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
    private TextView textViewTimePickerBasics;
    private TextView textViewTimePickerDialogBasics;
    private TextView textViewDatePickerDialogBasics;
    private TextView textViewNotificationBasics;
    private TextView textViewActionBarBasics;

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        switch(item.getItemId()){
            case R.id.phone:
                Toast.makeText(getBaseContext(), "You selected Phone", Toast.LENGTH_SHORT).show();
                break;

            case R.id.computer:
                Toast.makeText(getBaseContext(), "You selected Computer", Toast.LENGTH_SHORT).show();
                break;

            case R.id.gamepad:
                Toast.makeText(getBaseContext(), "You selected Gamepad", Toast.LENGTH_SHORT).show();
                break;

            case R.id.camera:
                Toast.makeText(getBaseContext(), "You selected Camera", Toast.LENGTH_SHORT).show();
                break;

            case R.id.video:
                Toast.makeText(getBaseContext(), "You selected Video", Toast.LENGTH_SHORT).show();
                break;

            case R.id.email:
                Toast.makeText(getBaseContext(), "You selected Email", Toast.LENGTH_SHORT).show();
                break;
            case R.id.android_studio:
                Toast.makeText(getBaseContext(), "You selected Android Studio", Toast.LENGTH_SHORT).show();
                break;

        }
        return true;

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
        textViewTimePickerBasics = (TextView) findViewById(R.id.tv_timePicker_basics);
        textViewTimePickerDialogBasics =(TextView) findViewById(R.id.tv_timePickerDialog_basics);
        textViewDatePickerDialogBasics =(TextView) findViewById(R.id.tv_datePickerDialog_basics);
        textViewNotificationBasics = (TextView) findViewById(R.id.tv_notification_basics);
        textViewActionBarBasics = (TextView) findViewById(R.id.tv_actionBar_basics);
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
        textViewTimePickerBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TimePickerBasicsActivity.class));
            }
        });
        textViewTimePickerDialogBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TimePickerDialogActivity.class));
            }
        });
        textViewDatePickerDialogBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DatePickerDialogActivity.class));
            }
        });
        textViewNotificationBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NotificationManagerActivity.class));
            }
        });
        textViewActionBarBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActionBarActivity.class));
            }
        });


    }


}
