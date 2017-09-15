package com.example.tristan.hciprototypes;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by Tristan on 10/09/2017.
 */

public class AdminTristan extends BaseAppActivity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_tristan);

        ScrollView itemList = (ScrollView)findViewById(R.id.ta_item_list);
        ScrollView tourList = (ScrollView)findViewById(R.id.ta_tour_members);

        final TextView nowShowing = (TextView)findViewById(R.id.ta_now_showing);

        LinearLayout toInsert = new LinearLayout(this);
        toInsert.setOrientation(LinearLayout.VERTICAL);

        for(int i = 1; i <= 10; i++){

            LinearLayout layout = new LinearLayout(this);
            layout.setOrientation(LinearLayout.HORIZONTAL);
            layout.setPadding(10,10,10,10);

            final TextView textView = new TextView(this);
            textView.setText("Item " + i);
            textView.setTypeface(null, Typeface.BOLD);
            textView.setTextSize(30);
            textView.setPadding(0,0,20,0);

            TextView textView1 = new TextView(this);
            textView1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
            textView1.setTypeface(null, Typeface.ITALIC);
            textView1.setTextSize(25);

            layout.addView(textView);
            layout.addView(textView1);

            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nowShowing.setText(textView.getText());
                }
            });

            toInsert.addView(layout);
            //itemList.addView(layout);

        }

        itemList.addView(toInsert);

        toInsert = new LinearLayout(this);
        toInsert.setOrientation(LinearLayout.VERTICAL);

        for(int j = 1; j <= 5; j++){
            LinearLayout layout = new LinearLayout(this);
            layout.setOrientation(LinearLayout.HORIZONTAL);
            layout.setPadding(10,10,10,10);

            TextView textView = new TextView(this);
            textView.setText("Person " + j);
            textView.setTextSize(20);
            textView.setPadding(0,0,20,0);

            TextView textView1 = new TextView(this);
            textView1.setText(Math.pow(j,2) + "m >");
            textView1.setTextSize(15);

            layout.addView(textView);
            layout.addView(textView1);

            //tourList.addView(layout);
            toInsert.addView(layout);

        }

        tourList.addView(toInsert);


    }

}
