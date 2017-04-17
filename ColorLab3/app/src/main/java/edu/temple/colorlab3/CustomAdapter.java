package edu.temple.colorlab3;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



/**
 * Created by MaxBu on 2/8/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    String colors[];

    public CustomAdapter(Context context, String colors[]){
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView colorsText = new TextView(context);
        colorsText.setText(colors[i]);
        colorsText.setBackgroundColor(Color.parseColor(colors[i]));

        return colorsText;
    }
}

