package com.cookandroid.and_project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Random;

public class CalenderActivity extends AppCompatActivity {
    TextView txt;
    ArrayAdapter<CharSequence> adapter = null;
    ImageView talk;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Calendar cal = Calendar.getInstance();
        int y=0, m=0;
        adapter = ArrayAdapter.createFromResource(this, R.array.test, android.R.layout.simple_spinner_dropdown_item);
        talk = findViewById(R.id.talk);

        cal.set(y,Calendar.MONTH ,m);
        Random random = new Random();
        int randomValue = random.nextInt(7);
        if(randomValue == 1){
            talk.setImageResource(R.drawable.talk_go);
        }else if(randomValue == 2){
           talk.setImageResource(R.drawable.talk_con);
        }else if(randomValue == 3){
            talk.setImageResource(R.drawable.talk_bul);
        }else if(randomValue == 4){
            talk.setImageResource(R.drawable.talk_po);
        }else if(randomValue == 5){
            talk.setImageResource(R.drawable.talk_hot);
        }else if(randomValue == 6){
            talk.setImageResource(R.drawable.talk_kka);
        }else{
            talk.setImageResource(R.drawable.talk_pain);
        }
    }
}