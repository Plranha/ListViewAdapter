package com.example.listviewadapter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] countriesArray = {"Gernamy", "Poland", "USA", "UAE", "Ukraine", "France", "Italy",
            "Gernamy", "Poland", "USA", "UAE", "Ukraine", "France", "Italy"};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView countriesList = (ListView) findViewById(R.id.countriesList);
        TextView selection = (TextView) findViewById(R.id.selection);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countriesArray);
        countriesList.setAdapter(adapter);
        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = countriesArray[position];
                selection.setText(selectedItem);
            }
        });

    }
}