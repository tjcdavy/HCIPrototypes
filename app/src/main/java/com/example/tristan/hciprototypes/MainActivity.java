package com.example.tristan.hciprototypes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout)findViewById(R.id.self1);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextThing();
            }
        });

        layout = (LinearLayout)findViewById(R.id.self2);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextThing();
            }
        });

        layout = (LinearLayout)findViewById(R.id.self3);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextThing();
            }
        });
    }

    public void nextThing(){
        Intent i = new Intent(this, ItemInfo.class);
        startActivity(i);
    }
}
