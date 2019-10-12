package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DatePickerDialogActivity extends AppCompatActivity {

    private Button buttonshowDatePickerDialog;
    private int month_x;
    private int year_x;
    private int day_x;
    private static final int DIALOG_ID = 0;

    private TextView currentDateTimeTimezone,currentDate_x,currentTime_x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_dialog);
        //setting current date as initial date
        final Calendar cl = Calendar.getInstance();
        year_x = cl.get(Calendar.YEAR);
        month_x = cl.get(Calendar.MONTH);
        day_x  = cl.get(Calendar.DAY_OF_MONTH);
        // to set onClick listener on button
        showDatePickerDialog();
        //to show date,time and timeZone
        showcurrentDateTimeAndTimeZone();



    }

    @Override
    protected Dialog onCreateDialog(int id){

     if(id ==DIALOG_ID)   {return new DatePickerDialog(DatePickerDialogActivity.this,kDatePickerListener,year_x,month_x,day_x);}
      return null;
    }

    protected DatePickerDialog.OnDateSetListener kDatePickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            year_x =i;
            month_x=i1;
            day_x=i2;
            Toast.makeText(DatePickerDialogActivity.this,day_x+"/"+(month_x+1)+"/"+year_x,Toast.LENGTH_SHORT).show();
        }
    };


    public void showDatePickerDialog(){
        buttonshowDatePickerDialog = (Button) findViewById(R.id.button_show_datePickerDialog);
        buttonshowDatePickerDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(DIALOG_ID);
            }
        });

    }
    public void showcurrentDateTimeAndTimeZone(){
        // to get current date and time with time zone
        Date dateNtime = Calendar.getInstance().getTime();
        Toast.makeText(this,dateNtime.toString(),Toast.LENGTH_SHORT).show();
        //  to get current date in desired format
        String currentDate = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        Toast.makeText(this,currentDate,Toast.LENGTH_SHORT).show();
        // to get current time in desired format
        String currentTime = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
        Toast.makeText(this,currentTime,Toast.LENGTH_SHORT).show();

        currentDateTimeTimezone =(TextView) findViewById(R.id.current_date_time_timeZone);
        currentDate_x =(TextView) findViewById(R.id.current_date);
        currentTime_x = (TextView) findViewById(R.id.current_time);
        currentDateTimeTimezone.setText(dateNtime.toString());
        currentDate_x.setText(currentDate);
        currentTime_x.setText(currentTime);

    }

}
