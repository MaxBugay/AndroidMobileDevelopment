package edu.temple.activitylab4;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by MaxBu on 2/15/2017.
 */

public class CanvasActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        Intent received = getIntent();
        String colorCode = received.getStringExtra("color_key");
        LinearLayout myLayout = (LinearLayout) findViewById(R.id.activity_canvas);
        myLayout.setBackgroundColor(Color.parseColor(colorCode));
    }
}
