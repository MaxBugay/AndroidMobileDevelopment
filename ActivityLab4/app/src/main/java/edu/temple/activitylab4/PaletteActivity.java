package edu.temple.activitylab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class PaletteActivity extends AppCompatActivity {
    boolean flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        final String[] colors = {"Red", "Yellow", "Green", "Cyan", "Blue", "Purple", "Magenta", "White", "Gray", "Black"};

        GridView gridView = (GridView) findViewById(R.id.gridview);

        CustomAdapter adapter = new CustomAdapter(PaletteActivity.this, colors);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent launchActivity = new Intent(PaletteActivity.this, CanvasActivity.class);
                String data = colors[position];
                launchActivity.putExtra("color_key", data);
                if (flag)
                    startActivity(launchActivity);
                else
                    flag = true;
            }
        });
    }
}
