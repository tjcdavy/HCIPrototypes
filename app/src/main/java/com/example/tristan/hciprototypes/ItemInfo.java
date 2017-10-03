package com.example.tristan.hciprototypes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Tristan on 11/09/2017.
 */

public class ItemInfo extends BaseAppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_info);

        String[] names = getResources().getStringArray(R.array.names);
        String[] desc = getResources().getStringArray(R.array.large_desc);

        int num = getIntent().getIntExtra("item_num", 0);

        TextView textView = (TextView)findViewById(R.id.info_title);
        textView.setText(names[num]);

        textView = (TextView)findViewById(R.id.info_text);
        textView.setText(desc[num]);

        Button back = (Button)findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
