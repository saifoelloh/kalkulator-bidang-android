package com.example.dinuskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

public class TriangleActivity extends AppCompatActivity {

    private EditText inputBase;
    private EditText inputHeight;
    private Button button;
    private float area;
    private float perimeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        inputBase = findViewById(R.id.base);
        inputHeight = findViewById(R.id.height);
        button = findViewById(R.id.triangleProcess);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int base = Integer.parseInt(inputBase.getText().toString());
                int height = Integer.parseInt(inputHeight.getText().toString());
                float c = base/2;
                float side = (float) Math.sqrt(Math.pow(c, 2) + Math.pow(height, 2));

                area = (float) (base/2) * height;
                perimeter = (float) side;
                resultActivity();
            }
        });
    }

    protected void resultActivity() {
        Intent intent = new Intent(this, ResultActivity.class);
        Bundle bundle = new Bundle();
        bundle.putFloat("area",area);
        bundle.putFloat("perimeter", perimeter);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
