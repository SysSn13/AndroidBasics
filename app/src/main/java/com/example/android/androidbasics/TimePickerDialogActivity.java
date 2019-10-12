package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerDialogActivity extends AppCompatActivity {
    private Button buttonShowTimePickerDialog;
    private static final int DIALOG_ID = 0;
    private int hour_x;
    private int minute_x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_dialog);
        showTimePickerDialog();
    }


    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_ID) {
            return new TimePickerDialog(TimePickerDialogActivity.this, kTimePickerListener, hour_x, minute_x, false);
        }
        return null;
    }

    protected TimePickerDialog.OnTimeSetListener kTimePickerListener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int i, int i1) {
            hour_x = i;
            minute_x = i1;
            Toast.makeText(TimePickerDialogActivity.this, hour_x + " : " + minute_x, Toast.LENGTH_SHORT).show();
        }
    };


        public void showTimePickerDialog() {
            buttonShowTimePickerDialog = (Button) findViewById(R.id.button_show_timePickerDialog);
            buttonShowTimePickerDialog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showDialog(DIALOG_ID);
                }
            });


        }
    }

