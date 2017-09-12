package com.example.tristan.hciprototypes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends BaseAppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout)findViewById(R.id.self1);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextThing(1);
            }
        });

        layout = (LinearLayout)findViewById(R.id.self2);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextThing(1);
            }
        });

        //layout = (LinearLayout)findViewById(R.id.self3);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextThing(1);
            }
        });

        layout = (LinearLayout)findViewById(R.id.self_map);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextThing(2);
            }
        });
    }

    public void nextThing(int i){
        Intent intent;
        switch(i){
            case 1:
                intent = new Intent(this, ItemInfo.class);
                break;
            case 2:
                intent = new Intent(this, MapTristan.class);
                break;
            default:
                intent = new Intent(this, ItemInfo.class);
                break;
        }
        startActivity(intent);
    }
}
