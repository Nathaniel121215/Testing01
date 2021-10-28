package com.example.testing01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class nav_inventory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_inventory);

        getSupportActionBar().hide();

        Calendar calendar = Calendar.getInstance();
        String currentDate = new SimpleDateFormat("EEE, MMM d yyyy", Locale.getDefault()).format(new Date());

        TextView txtViewDate = findViewById(R.id.invdisplay_date);
        txtViewDate.setText(currentDate);
    }
}