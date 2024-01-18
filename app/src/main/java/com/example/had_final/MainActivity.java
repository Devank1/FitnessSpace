package com.example.had_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.had_final.BMICalculatorActivity;
import com.example.had_final.WeightReductionActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bmiButton = findViewById(R.id.bmiButton);
        Button weightReductionButton = findViewById(R.id.weightReductionButton);
        Button weightGainButton = findViewById(R.id.weightGainButton);
        Button hiitButton = findViewById(R.id.hiitButton);
        Button registerButton = findViewById(R.id.registerButton);
        Button viewUsersButton = findViewById(R.id.viewUsersButton);



        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BMICalculatorActivity.class));
            }
        });

        weightReductionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WeightReductionActivity.class));
            }
        });

        weightGainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WeightGainActivity.class));
            }
        });

        hiitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HIITActivity.class));
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });

        viewUsersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ViewUsersActivity.class));
            }
        });
    }
}