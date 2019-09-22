package com.example.dinuskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private String hasil;
    private TextView counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        hasil = getIntent().getStringExtra("number");

        counter = findViewById(R.id.txtHasil);
        counter.setText(hasil);
    }
}
