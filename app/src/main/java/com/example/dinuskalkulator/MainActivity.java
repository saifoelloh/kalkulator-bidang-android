package com.example.dinuskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    private Button btnCircle;
    private Button btnSquare;
    private Button btnTriangle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCircle = (Button) findViewById(R.id.btnCircle);
        btnSquare = (Button) findViewById(R.id.btnSquare);
        btnTriangle = (Button) findViewById(R.id.btnTriangle);

        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveActivity("circle");
            }
        });



    }

    protected void moveActivity(String name) {
        Intent intent = new Intent(this, MainActivity.class);
        switch (name) {
            case "circle":
                intent = new Intent(this, CircleActivity.class);
                break;
            case "rectangle":
                intent = new Intent(this, RectangleActivity.class);
                break;
            case "triangle":
                intent = new Intent(this, TriangleActivity.class);
                break;
        };
        startActivity(intent);
    }
}
