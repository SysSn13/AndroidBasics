package com.example.android.androidbasics;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlertDialogBasics extends AppCompatActivity {
    private Button button_sub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_basics);
        OnButtonClickListener();
    }
    public void OnButtonClickListener(){
    button_sub = (Button) findViewById(R.id.button_submit_Alert);
    button_sub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder a_builder = new AlertDialog.Builder(AlertDialogBasics.this);
            a_builder.setMessage("Are you sure you want to exit?").setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
            AlertDialog alert = a_builder.create();
            alert.setTitle("Alert!!!");
            alert.show();



        }
    });
    }
}