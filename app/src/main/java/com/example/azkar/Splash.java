package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                    Intent intent = new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };
        thread.start();
        mp = MediaPlayer.create(getBaseContext(), R.raw.splashaudio);
        mp.start();
    }
    protected void onStop() {
        super.onStop();
        if (mp.isPlaying()) {
            mp.pause();

        }
    }
}