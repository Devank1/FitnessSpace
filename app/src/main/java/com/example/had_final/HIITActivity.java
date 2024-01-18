package com.example.had_final;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HIITActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiit);

        TextView exercisesTextView = findViewById(R.id.exercisesTextView);
        WebView webView = findViewById(R.id.webView);

        String exercises = "1. Jumping Jacks: 30 seconds\n" +
                "2. Push-ups: 30 seconds\n" +
                "3. High Knees: 30 seconds\n" +
                "4. Burpees: 30 seconds\n" +
                "5. Mountain Climbers: 30 seconds\n" +
                "6. Squats: 30 seconds\n" +
                "7. Butt Kicks: 30 seconds\n" +
                "8. Lunges: 30 seconds\n" +
                "9. Plank: 30 seconds\n" +
                "10. Rest: 30 seconds\n" +
                "Repeat 4-5 times.";

        exercisesTextView.setText(exercises);

        // Load a web page in the WebView
        webView.loadUrl("https://www.healthifyme.com/blog/10-best-hiit-cardio-workout-for-weight-loss/");
    }
}