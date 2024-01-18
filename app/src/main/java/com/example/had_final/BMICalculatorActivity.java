package com.example.had_final;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BMICalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);

        final EditText weightInput = findViewById(R.id.weightInput);
        final EditText heightInput = findViewById(R.id.heightInput);
        final Button calculateButton = findViewById(R.id.calculateButton);
        final TextView resultText = findViewById(R.id.resultText);
        final ImageView imageView = findViewById(R.id.imageView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightStr = weightInput.getText().toString();
                String heightStr = heightInput.getText().toString();

                if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
                    float weight = Float.parseFloat(weightStr);
                    float height = Float.parseFloat(heightStr);

                    if (weight <= 0 || height <= 0) {
                        resultText.setText("Weight and height must be greater than zero");
                    } else {
                        float bmi = weight / (height * height);
                        resultText.setText(String.format("Your BMI is %.2f", bmi));

                        // Set the image in ImageView based on the BMI
                        if (bmi < 18.5) {
                            imageView.setImageResource(R.drawable.underweight); // replace with your own resource
                        } else if (bmi < 24.9) {
                            imageView.setImageResource(R.drawable.normal); // replace with your own resource
                        } else {
                            imageView.setImageResource(R.drawable.overweight); // replace with your own resource
                        }
                    }
                } else {
                    resultText.setText("Please enter both weight and height");
                }
            }
        });
    }
}