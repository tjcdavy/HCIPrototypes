package com.example.tristan.hciprototypes;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends BaseAppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] names = getResources().getStringArray(R.array.small_desc);

        //LinearLayout layout = (LinearLayout)findViewById(R.id.self1);

        LinearLayout[] newLayout = new LinearLayout[names.length];

        LinearLayout scroller = (LinearLayout)findViewById(R.id.scroll_insert);

        for(int i = 0; i < names.length; i++){

            DisplayMetrics metrics = getResources().getDisplayMetrics();
            float dp1 = 300f;
            float fpixels1 = metrics.density * dp1;
            int pixels1 = (int) (fpixels1 + 0.5f);

            newLayout[i] = new LinearLayout(this);
            newLayout[i].setOrientation(LinearLayout.VERTICAL);
            newLayout[i].setLayoutParams(new LinearLayout.LayoutParams(pixels1, ViewGroup.LayoutParams.MATCH_PARENT));
            newLayout[i].setBackgroundResource(R.drawable.border);


            float dp = 50f;
            float fpixels = metrics.density * dp;
            int pixels = (int) (fpixels + 0.5f);


            LinearLayout.LayoutParams steve = new LinearLayout.LayoutParams(pixels,pixels);
            steve.gravity= Gravity.CENTER;


            ImageView icon = new ImageView(this);
            icon.setLayoutParams(steve);
            //icon.setForegroundGravity(View.TEXT_ALIGNMENT_CENTER);
            icon.setImageResource(R.drawable.skull);
            newLayout[i].addView(icon);




            TextView smallDesc = new TextView(this);
            smallDesc.setText(names[i]);
            smallDesc.setTextSize(20);
            newLayout[i].addView(smallDesc);

            //Log.d("Names = ", names[i]);

            TextView more = new TextView(this);
            more.setText(R.string.more);
            more.setTextSize(20);
            newLayout[i].addView(more);

            scroller.addView(newLayout[i]);

            final int j = i;
            newLayout[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nextThing(j);
                }
            });

        }




//        layout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                nextThing(1);
//            }
//        });
//
//        layout = (LinearLayout)findViewById(R.id.self2);
//        layout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                nextThing(1);
//            }
//        });
//
//        //layout = (LinearLayout)findViewById(R.id.self3);
//        layout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                nextThing(1);
//            }
//        });
//
        LinearLayout layout = (LinearLayout)findViewById(R.id.self_map);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextThing(-1);
            }
        });
    }

    public void nextThing(int i){
        Intent intent;
        switch(i){
            case -1:
                intent = new Intent(this, MapTristan.class);
                break;
            default:
                intent = new Intent(this, ItemInfo.class);
                intent.putExtra("item_num", i);
                break;
        }
        startActivity(intent);
    }
}
