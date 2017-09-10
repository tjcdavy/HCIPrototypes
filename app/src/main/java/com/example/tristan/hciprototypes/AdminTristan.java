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

public class AdminTristan extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_tristan);

        ScrollView scroller = (ScrollView)findViewById(R.id.ta_user_list);

        final TextView nowShowing = (TextView)findViewById(R.id.ta_now_showing);

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
            textView1.setText("This is the description for whatever Item " + i + ".  Some more text.");
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

            scroller.addView(layout);

        }


    }

}
