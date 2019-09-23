package com.example.dinuskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView tvAreaa;
    private TextView tvPerimeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvAreaa = findViewById(R.id.area);
        tvPerimeter = findViewById(R.id.perimeter);

        Bundle bundle = (Bundle) getIntent().getExtras();
        Float area = (Float) bundle.getFloat("area");
        Float perimeter = (Float) bundle.getFloat("perimeter");

        String msgArea = "area : "+area.toString();
        String msgPerimeter = "perimeter : "+perimeter.toString();

        tvAreaa.setText(msgArea);
        tvPerimeter.setText(msgPerimeter);
    }
}
