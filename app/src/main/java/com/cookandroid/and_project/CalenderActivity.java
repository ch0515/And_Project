package com.cookandroid.and_project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;

public class CalenderActivity extends AppCompatActivity {
TextView txt;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        txt = findViewById(R.id.calentv);

        Calendar cal = Calendar.getInstance();
        int y=0, m=0;

        y = cal.get(Calendar.YEAR);
        m = cal.get(Calendar.MONTH);

        txt.setText(y+"-"+(m+1));
    }
}