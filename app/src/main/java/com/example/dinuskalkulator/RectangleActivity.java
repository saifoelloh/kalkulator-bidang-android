package com.example.dinuskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RectangleActivity extends AppCompatActivity {

    private Button button;
    private EditText inputBase;
    private EditText inputHeight;
    private float area;
    private float perimeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        button = (Button) findViewById(R.id.rectangleProcess);
        inputBase = (EditText) findViewById(R.id.base);
        inputHeight = (EditText) findViewById(R.id.height);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int base = Integer.parseInt(inputBase.getText().toString());
                int height = Integer.parseInt(inputHeight.getText().toString());
                area = base * height;
                perimeter = 2 * (base+height);
                resultActivity();
            }
        });
    }

    protected void resultActivity() {
        Intent intent = new Intent(this, ResultActivity.class);
        Bundle bundle = new Bundle();
        bundle.putFloat("area", area);
        bundle.putFloat("perimeter", perimeter);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
