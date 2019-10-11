package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SeekBarBasics extends AppCompatActivity {
    private static SeekBar seekBar;
    private static TextView textViewSeekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_basics);
        trackSeekBar();
    }

    public void trackSeekBar(){
        seekBar=(SeekBar) findViewById(R.id.seekBar);
        textViewSeekBar = (TextView) findViewById(R.id.textView_seekBar);
        textViewSeekBar.setText("Covered  "+seekBar.getProgress()+"/"+seekBar.getMax());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int progress = i;
                textViewSeekBar.setText("Covered  "+i+"/"+seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarBasics.this,"SeekBar in StartTracking",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarBasics.this,"SeekBar in StopTracking",Toast.LENGTH_SHORT).show();
            }
        });

    }


}
