package com.cookandroid.and_project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MakePizza extends AppCompatActivity {
TextView Today;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_pizza);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Today = findViewById(R.id.Today);

        Calendar cal = Calendar.getInstance();
        int y=0, m=0, d=0;

        y = cal.get(Calendar.YEAR);
        m = cal.get(Calendar.MONTH);
        d = cal.get(Calendar.DAY_OF_MONTH);
        Today.setText(y+"-"+(m+1)+"-"+d);
    }
}