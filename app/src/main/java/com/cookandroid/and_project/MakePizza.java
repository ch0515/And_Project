package com.cookandroid.and_project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;

public class MakePizza extends AppCompatActivity {
TextView Today;
ImageView btn_cal,btn_plus;
ImageView oni,mus,tom,pi,ham,oli,pa;
LinearLayout list2, list3, list4, list5, list6, list7;
int count = 0;
CheckBox item1, item2, item3, item4, item5, item6, item7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_pizza);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Today = findViewById(R.id.txt);
        btn_cal = findViewById(R.id.btn_cal);
        btn_plus = findViewById(R.id.btn_plus);
        list2 = findViewById(R.id.list2);
        list3 = findViewById(R.id.list3);
        list4 = findViewById(R.id.list4);
        list5 = findViewById(R.id.list5);
        list6 = findViewById(R.id.list6);
        list7 = findViewById(R.id.list7);
        oni = findViewById(R.id.oni);
        mus = findViewById(R.id.mus);
        tom = findViewById(R.id.tom);
        pi = findViewById(R.id.pi);
        ham = findViewById(R.id.ham);
        oli = findViewById(R.id.oli);
        pa = findViewById(R.id.pa);
        item1 = findViewById(R.id.item1);
        item2 = findViewById(R.id.item2);
        item3 = findViewById(R.id.item3);
        item4 = findViewById(R.id.item4);
        item5 = findViewById(R.id.item5);
        item6 = findViewById(R.id.item6);
        item7 = findViewById(R.id.item7);
        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MakePizza.this, CalenderActivity.class);
                startActivity(in);
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count +1;
                if(count == 1){
                    list2.setVisibility(View.VISIBLE);
                }else if(count == 2){
                    list3.setVisibility(View.VISIBLE);
                }else if(count == 3){
                    list4.setVisibility(View.VISIBLE);
                }else if(count==4){
                    list5.setVisibility(View.VISIBLE);
                }else if(count == 5){
                    list6.setVisibility(View.VISIBLE);
                }else{
                    list7.setVisibility(View.VISIBLE);
                }
            }
        });
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (item1.isChecked()){
                    oni.setVisibility(View.VISIBLE);
                }else{
                    oni.setVisibility(View.INVISIBLE);
                }
            }
        });
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (item2.isChecked()){
                    mus.setVisibility(View.VISIBLE);
                }else{
                    mus.setVisibility(View.INVISIBLE);
                }
            }
        });
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (item3.isChecked()){
                    tom.setVisibility(View.VISIBLE);
                }else{
                    tom.setVisibility(View.INVISIBLE);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (item4.isChecked()){
                    pi.setVisibility(View.VISIBLE);
                }else{
                    pi.setVisibility(View.INVISIBLE);
                }
            }
        });
        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (item5.isChecked()){
                    ham.setVisibility(View.VISIBLE);
                }else{
                    ham.setVisibility(View.INVISIBLE);
                }
            }
        });
        item6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (item6.isChecked()){
                    oli.setVisibility(View.VISIBLE);
                }else{
                    oli.setVisibility(View.INVISIBLE);
                }
            }
        });
        item7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (item7.isChecked()){
                    pi.setVisibility(View.VISIBLE);
                }else{
                    pi.setVisibility(View.INVISIBLE);
                }
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