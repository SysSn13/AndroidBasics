package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ListViewBasics extends AppCompatActivity {
    private ListView simpleList, coustomList;
    private String AnimalsName[] = {"Cat", "Dog", "Cow", "Monkey", "Lion", "Rabbit", "Elephant", "Zebra"};
    private int animalsImage[] = {R.drawable.cat, R.drawable.dog, R.drawable.cow, R.drawable.monkey, R.drawable.lion, R.drawable.rabbit, R.drawable.elephant, R.drawable.zebra};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_basics);

//simple list using ArrayAdapter

        simpleList = (ListView) findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(ListViewBasics.this,
                R.layout.name_list, R.id.textView_name_list, AnimalsName);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String value = (String) simpleList.getItemAtPosition(position);
                Toast.makeText(ListViewBasics.this, "Value: " + value, Toast.LENGTH_SHORT).show();

            }
        });




    }
}
