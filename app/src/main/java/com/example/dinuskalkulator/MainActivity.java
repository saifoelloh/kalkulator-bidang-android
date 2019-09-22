package com.example.dinuskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView number;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = (TextView) findViewById(R.id.counter);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        btnResult = (Button) findViewById(R.id.proses);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                number.setText(Integer.toString(counter));
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter!=0)
                    counter--;
                number.setText(Integer.toString(counter));
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultActivity();
            }
        });
    }

    protected void resultActivity() {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("number", Integer.toString(counter));
        startActivity(intent);
    }
}
