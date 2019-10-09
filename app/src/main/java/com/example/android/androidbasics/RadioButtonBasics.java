package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonBasics extends AppCompatActivity {
    private static RadioButton radio_b;
    private static RadioGroup radio_group;
    private static Button button_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_basics);
        onClickListenerButton();
    }

    public void onClickListenerButton(){
         radio_group = (RadioGroup) findViewById(R.id.radioGroup_animals);
         button_submit = (Button) findViewById(R.id.button_submit);
         button_submit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 int selectedId = radio_group.getCheckedRadioButtonId();

                     radio_b = (RadioButton) findViewById(selectedId);
                     if(radio_b.getText().toString()!=null) {
                         Toast.makeText(RadioButtonBasics.this, radio_b.getText().toString() + " is selected", Toast.LENGTH_SHORT).show();
                     }


             }
         });




    }
}
