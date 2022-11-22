package com.cookandroid.and_project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class MakePizza extends AppCompatActivity {
TextView Today;
ImageView btn_cal;
ImageView oni,mus,tom,pi,ham,oli,pa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_pizza);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Today = findViewById(R.id.Today);
        btn_cal = findViewById(R.id.btn_cal);
        oni = findViewById(R.id.oni);
        mus = findViewById(R.id.mus);
        tom = findViewById(R.id.tom);
        pi = findViewById(R.id.pi);
        ham = findViewById(R.id.ham);
        oli = findViewById(R.id.oli);
        pa = findViewById(R.id.pa);
        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MakePizza.this, CalenderActivity.class);
                startActivity(in);
            }
        });
        Calendar cal = Calendar.getInstance();
        int y=0, m=0, d=0;
        y = cal.get(Calendar.YEAR);
        m = cal.get(Calendar.MONTH);
        d = cal.get(Calendar.DAY_OF_MONTH);
        Today.setText(y+"-"+(m+1)+"-"+d);
    }
}