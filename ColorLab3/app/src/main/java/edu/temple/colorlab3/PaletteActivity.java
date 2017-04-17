package edu.temple.colorlab3;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;


public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        final View view = findViewById(R.id.activity_palette);

        String colors[] = {"Red", "Yellow", "Green", "Blue", "Purple"};

        final CustomAdapter myAdapter = new CustomAdapter(this, colors);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setAdapter(myAdapter);

        AdapterView.OnItemSelectedListener oisl = new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                view.setBackgroundColor(Color.parseColor(((TextView)view).getText().toString()));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };

        spinner.setOnItemSelectedListener(oisl);
    }
}
