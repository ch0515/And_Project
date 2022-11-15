package com.cookandroid.and_project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Random;

public class CalenderActivity extends AppCompatActivity {
    TextView txt;
    TextView pizzatext;
    ArrayAdapter<CharSequence> adapter = null;
    Spinner spinner = null;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Calendar cal = Calendar.getInstance();
        pizzatext = findViewById(R.id.pizzatext);
        int y=0, m=0;
        adapter = ArrayAdapter.createFromResource(this, R.array.test, android.R.layout.simple_spinner_dropdown_item);
        spinner = findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        String text = spinner.getSelectedItem().toString();
        switch (text){
            case "2022-1":
                y = 2022;
                m = 1;
                break;
            case "2022-2":
                y = 2022;
                m = 2;
                break;
            default:
                        y = cal.get(Calendar.YEAR);
                        m = cal.get(Calendar.MONTH);
        }
        cal.set(y,Calendar.MONTH ,m);
        Random random = new Random();
        int randomValue = random.nextInt(2);
        if(randomValue == 0){
            pizzatext.setText("오늘의 피자는 불고기 피자");
        }else if(randomValue == 1){
            pizzatext.setText("오늘의 피자는 새우피자");
        }else{
            pizzatext.setText("오늘의 피자는 감자 피자");
        }
    }
}