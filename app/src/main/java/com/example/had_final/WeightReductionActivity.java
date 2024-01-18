package com.example.had_final;


import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

    public class WeightReductionActivity extends AppCompatActivity {

        private String[] videoLinks = {
                "https://dsqqu7oxq6o1v.cloudfront.net/a-lady-exercising-using-a-rope-1873480-high.mp4",
                "https://dsqqu7oxq6o1v.cloudfront.net/woman-practicing-boxing-on-punching-bag-1873477-high.mp4",
                "https://dsqqu7oxq6o1v.cloudfront.net/a-woman-using-training-tire-for-workouts-1861619-high.mp4",
                "https://v6.cdnpk.net/videvo_files/video/premium/partners0555/large_watermarked/2617251_preview.mp4"
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_weight_reduction);

            TextView pointsTextView = findViewById(R.id.pointsTextView);

            String points = "1. Eat a high protein breakfast.\n" +
                    "2. Avoid sugary drinks and fruit juice.\n" +
                    "3. Drink water before meals.\n" +
                    "4. Choose weight-loss-friendly foods.\n" +
                    "5. Eat soluble fiber.\n" +
                    "6. Drink coffee or tea.\n" +
                    "7. Eat mostly whole, unprocessed foods.\n" +
                    "8. Eat your food slowly.\n" +
                    "9. Get a good night's sleep, every night.\n" +
                    "10. Exercise regularly.";

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