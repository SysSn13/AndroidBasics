package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewActivity extends AppCompatActivity {
private AutoCompleteTextView  autoCompleteTextView;
private String suggestions[] ={"Dog","Cat","Cow","Lion","Tiger","Elephant"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);
        autoCompleteTextView =(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView) ;
        ArrayAdapter arrayAdapter =new ArrayAdapter(this,android.R.layout.select_dialog_item,suggestions);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(arrayAdapter);


    }
}
