package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerBasicsActivity extends AppCompatActivity {
    private TimePicker timePicker;
    private Button buttonShowTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_basics);
        showTime();
    }
    public void showTime(){
        timePicker =(TimePicker) findViewById(R.id.time_picker);
        buttonShowTime = (Button) findViewById(R.id.button_showTime);
        timePicker.setIs24HourView(false);
        buttonShowTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Time is "+timePicker.getCurrentHour()+
                        ":"+timePicker.getCurrentMinute(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
