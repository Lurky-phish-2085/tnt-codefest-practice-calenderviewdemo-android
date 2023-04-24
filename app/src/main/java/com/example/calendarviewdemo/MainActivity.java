package com.example.calendarviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button showCalBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCalBtn = findViewById(R.id.select_date_btn);
        showCalBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == showCalBtn) {
            new CalendarDialog().show(getSupportFragmentManager(), "tag");
        }
    }
}