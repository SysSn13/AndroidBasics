package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.Toast;

public class Checkbox extends AppCompatActivity {

    private CheckBox checkBoxCat, checkBoxCow, checkBoxDog;
    private Button checkBoxButton;
    private boolean checked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        addListenerOnButton();
        addClickListenerOncheckBoxes();

    }
//Method for Adding click listener on the button CHECK

    public void addListenerOnButton() {
        checkBoxCat = (CheckBox) findViewById(R.id.cbCat);
        checkBoxCow = (CheckBox) findViewById(R.id.cbCow);
        checkBoxDog = (CheckBox) findViewById(R.id.cbDog);
        checkBoxButton = (Button) findViewById(R.id.btnCheckboxActivity);
        checkBoxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();
                result.append("Dog: ").append(checkBoxDog.isChecked());
                result.append(" Cat: ").append(checkBoxCat.isChecked());
                result.append(" Cow: ").append(checkBoxCow.isChecked());
                Toast.makeText(Checkbox.this, result, Toast.LENGTH_SHORT).show();
            }
        });


    }
//Method for onClick listener on check boxes
// In xml code onClick is used
    public void addListenerOncheckBoxes(View view) {

        checkBoxCat = (CheckBox) findViewById(R.id.cbCat);
        checkBoxCow = (CheckBox) findViewById(R.id.cbCow);
        checkBoxDog = (CheckBox) findViewById(R.id.cbDog);

        checked = ((CheckBox) view).isChecked();
        if (checked) {


            switch (view.getId()) {
                case R.id.cbCat:
                    Toast.makeText(Checkbox.this, checkBoxCat.getText().toString() + " is selected", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.cbDog:
                    Toast.makeText(Checkbox.this, checkBoxDog.getText().toString() + " is selected", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.cbCow:
                    Toast.makeText(Checkbox.this, checkBoxCow.getText().toString() + " is selected", Toast.LENGTH_SHORT).show();
                    break;

            }
        }
    }

 //Method for adding click listeners on each check box
 // no code for xml, only java code
    public void addClickListenerOncheckBoxes(){
        checkBoxCat = (CheckBox) findViewById(R.id.cbCat);
        checkBoxCow = (CheckBox) findViewById(R.id.cbCow);
        checkBoxDog = (CheckBox) findViewById(R.id.cbDog);
        checkBoxCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean test = ((CheckBox) view).isChecked();
                if(test){
                    Toast.makeText(Checkbox.this,"Cat is selected",Toast.LENGTH_SHORT).show();
                }


            }
        });
        checkBoxDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean test = ((CheckBox) view).isChecked();
                if(test){
                    Toast.makeText(Checkbox.this,"Dog is selected",Toast.LENGTH_SHORT).show();
                }


            }
        });
        checkBoxCow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean test = ((CheckBox) view).isChecked();
                if(test){
                    Toast.makeText(Checkbox.this,"Cow is selected",Toast.LENGTH_SHORT).show();
                }


            }
        });

    }





}


