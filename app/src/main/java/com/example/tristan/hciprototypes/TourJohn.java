package com.example.tristan.hciprototypes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

/**
 * Created by Tristan on 11/09/2017.
 */

public class TourJohn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        final ScrollView itemList = (ScrollView)findViewById(R.id.jt_scroll_help);
        final ImageView map = (ImageView)findViewById(R.id.jt_map);
        final ScrollView infoView = (ScrollView)findViewById(R.id.jt_scroll_info);


        Button button = (Button)findViewById(R.id.jt_help_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemList.setVisibility(View.VISIBLE);
                map.setVisibility(View.GONE);
                infoView.setVisibility(View.GONE);
            }
        });


        button = (Button)findViewById(R.id.jt_map_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemList.setVisibility(View.GONE);
                map.setVisibility(View.VISIBLE);
                infoView.setVisibility(View.GONE);
            }
        });


        button = (Button)findViewById(R.id.jt_info_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemList.setVisibility(View.GONE);
                map.setVisibility(View.GONE);
                infoView.setVisibility(View.VISIBLE);
            }
        });
    }
}
