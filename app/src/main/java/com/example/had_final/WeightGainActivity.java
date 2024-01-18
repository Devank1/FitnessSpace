package com.example.had_final;


import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class WeightGainActivity extends AppCompatActivity {

    private String[] videoLinks = {
            "https://dsqqu7oxq6o1v.cloudfront.net/a-lady-exercising-using-a-rope-1873480-high.mp4",
            "https://dsqqu7oxq6o1v.cloudfront.net/woman-practicing-boxing-on-punching-bag-1873477-high.mp4",
            "https://dsqqu7oxq6o1v.cloudfront.net/a-woman-using-training-tire-for-workouts-1861619-high.mp4",
            "https://v6.cdnpk.net/videvo_files/video/premium/partners0555/large_watermarked/2617251_preview.mp4"
            // Add more video links here
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_gain);

        TextView pointsTextView = findViewById(R.id.pointsTextView);

        String points = "1. Eat more calories than your body burns.\n" +
                "2. Eat plenty of protein.\n" +
                "3. Eat at least 3 meals per day.\n" +
                "4. Eat plenty of carbs and fat.\n" +
                "5. Eat a lot of energy-dense foods and use sauces, spices and condiments.\n" +
                "6. Lift heavy weights to improve strength and muscle mass.\n" +
                "7. Use bigger plates to eat more.\n" +
                "8. Get quality sleep.\n" +
                "9. Don't drink water before meals.\n" +
                "10. Take creatine supplement.";

        pointsTextView.setText(points);

        final VideoView videoView = findViewById(R.id.videoview);

        Button playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(videoLinks.length);
                Uri videoUri = Uri.parse(videoLinks[index]);
                videoView.setVideoURI(videoUri);
                videoView.start();
            }
        });
    }
}