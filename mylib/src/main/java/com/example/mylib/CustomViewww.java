package com.example.mylib;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by user on 2/25/2018.
 */

public class CustomViewww extends LinearLayout {
    TextView textView;
    Button button;
    View view;
    View plusButton;
    public CustomViewww(Context context) {
        super(context);
        init(context);
    }

    public CustomViewww(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
       view= inflate(context, R.layout.customlayout, this);
         textView=(TextView)findViewById(R.id.text1);
         button=(Button)findViewById(R.id.btn);

    }
}
