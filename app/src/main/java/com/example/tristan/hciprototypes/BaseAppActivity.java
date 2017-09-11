package com.example.tristan.hciprototypes;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by Tristan on 11/09/2017.
 */

public class BaseAppActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);



        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage(R.string.initial_text);
        alertDialog.setCancelable(true);

        alertDialog.setPositiveButton(R.string.tristan_uis, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                createAlert(1);

            }
        });

        alertDialog.setNegativeButton(R.string.john_uis, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                createAlert(2);
            }
        });

        alertDialog.create().show();

        return true;
    }

    public void createAlert(int i){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage(R.string.which_mode);
        alertDialog.setCancelable(true);



        switch (i){
            case 1:
                alertDialog.setPositiveButton(R.string.tristan_admin, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), AdminTristan.class);
                        startActivity(intent);

                    }
                });

                alertDialog.setNegativeButton(R.string.tristan_tour, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent intent = new Intent(getApplicationContext(), ItemInfo.class);
                        startActivity(intent);
                    }
                });

                alertDialog.setNeutralButton(R.string.tristan_solo, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
                break;
            case 2:
                alertDialog.setPositiveButton(R.string.john_admin, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), AdminJohn.class);
                        startActivity(intent);

                    }
                });

                alertDialog.setNegativeButton(R.string.john_tour, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), TourJohn.class);
                        startActivity(intent);
                    }
                });
                break;
        }



        alertDialog.create().show();

    }

}
