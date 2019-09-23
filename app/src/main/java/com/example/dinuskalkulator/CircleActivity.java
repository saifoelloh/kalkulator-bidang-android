package com.example.dinuskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CircleActivity extends AppCompatActivity {

    private float area;
    private float perimeter;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        editText = (EditText) findViewById(R.id.radius);
        button = (Button) findViewById(R.id.circleProcess);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(editText.getText().toString());
                float temp2 = (float) Math.pow(temp, 2);
                area = (float) Math.PI * temp2;
                perimeter = (float) Math.PI * (2*temp);
                resultActivity();
            }
        });

    }

    public void resultActivity() {
        Intent intent = new Intent(this, ResultActivity.class);
        Bundle bundle = new Bundle();
        bundle.putFloat("area", area);
        bundle.putFloat("perimeter", perimeter);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
