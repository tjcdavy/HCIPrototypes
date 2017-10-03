package com.example.tristan.hciprototypes;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Tristan on 10/09/2017.
 */

public class AdminJohn extends BaseAppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_john);

        final ScrollView itemList = (ScrollView)findViewById(R.id.ja_scroll_select);
        final TextView nowShowing = (TextView)findViewById(R.id.ta_now_showing);

        LinearLayout toInsert = new LinearLayout(this);
        toInsert.setOrientation(LinearLayout.VERTICAL);

        final String[] names = getResources().getStringArray(R.array.names);
        final String[] desc = getResources().getStringArray(R.array.small_desc);
        final String[] longDesc = getResources().getStringArray(R.array.large_desc);

        for(int i = 0; i < desc.length; i++){

            LinearLayout layout = new LinearLayout(this);
            layout.setOrientation(LinearLayout.HORIZONTAL);
            layout.setPadding(10,10,10,10);

            final TextView textView = new TextView(this);
            textView.setText(names[i]);
            textView.setTypeface(null, Typeface.BOLD);
            textView.setTextSize(30);
            textView.setPadding(0,0,20,0);


            TextView textView1 = new TextView(this);
            textView1.setText(desc[i]);
            textView1.setTypeface(null, Typeface.ITALIC);
            textView1.setTextSize(25);

            layout.addView(textView);
            layout.addView(textView1);

            final int j = i;
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView view = (TextView)findViewById(R.id.ja_info_title);
                    view.setText(names[j]);
                    view = (TextView)findViewById(R.id.ja_info_text);
                    view.setText(longDesc[j]);
                }
            });

            toInsert.addView(layout);
            //itemList.addView(layout);

        }

        itemList.addView(toInsert);

        Button button = (Button)findViewById(R.id.ja_select_button);

        final ImageView map = (ImageView)findViewById(R.id.ja_map);
        final ScrollView infoView = (ScrollView)findViewById(R.id.ja_scroll_info);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemList.setVisibility(View.VISIBLE);
                map.setVisibility(View.GONE);
                infoView.setVisibility(View.GONE);
            }
        });

        button = (Button)findViewById(R.id.ja_map_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemList.setVisibility(View.GONE);
                map.setVisibility(View.VISIBLE);
                infoView.setVisibility(View.GONE);
            }
        });

        button = (Button)findViewById(R.id.ja_info_button);

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
