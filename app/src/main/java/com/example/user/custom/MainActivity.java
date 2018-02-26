package com.example.user.custom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.mylib.*;
public class MainActivity extends AppCompatActivity implements click {
Button btn;
CustomViewww customViewww;
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btnapp);
       // customViewww.setVisibility(View.INVISIBLE);
        linearLayout=(LinearLayout)findViewById(R.id.lin1);
        linearLayout.setVisibility(View.INVISIBLE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public void clickme(View view) {
        Toast.makeText(getApplicationContext(),"welcome in library",Toast.LENGTH_LONG).show();
    }
}
