package com.cookandroid.and_project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
TextView Day;
Button MakeP, Calender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Day = findViewById(R.id.Day);
        MakeP = findViewById(R.id.MakePizza);
        Calender = findViewById(R.id.calender);

        Calendar cal = Calendar.getInstance();
        int y=0, m=0, d=0;

        y = cal.get(Calendar.YEAR);
        m = cal.get(Calendar.MONTH) +1;
        d = cal.get(Calendar.DAY_OF_MONTH);

        Day.setText(y+"-"+m+"-"+d);
        Calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), Calendar.class);
                startActivity(in);
            }
        });
    }

}