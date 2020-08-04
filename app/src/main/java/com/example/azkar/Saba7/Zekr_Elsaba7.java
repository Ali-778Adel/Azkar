package com.example.azkar.Saba7;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.azkar.MainActivity;
import com.example.azkar.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Zekr_Elsaba7 extends AppCompatActivity {

    @BindView(R.id.zekr_1)
    TextView zekr1;
    @BindView(R.id.play_image)
    ImageButton playImage;
    @BindView(R.id.puse_image)
    ImageButton puseImage;
    @BindView(R.id.forward_image)
    ImageButton forwardImage;
    @BindView(R.id.rewind_image)
    ImageButton rewindImage;
    @BindView(R.id.counter_down)
    Button counterDown;
    MediaPlayer mp;
    int text_size_1 = 22;
    int count = 9;
    Onclicks onclicks;
    @BindView(R.id.seekBar)
    SeekBar seekBar;
    Handler seekHandler=new Handler();

    public Zekr_Elsaba7() {
    }

    public Zekr_Elsaba7(MediaPlayer mp, int text_size_1, int count,
                        ImageButton playImage, ImageButton puseImage, ImageButton forwardImage,
                        ImageButton rewindImage, TextView zekr1, Button counterDown,SeekBar seekBar,Handler seekHandler) {
        this.mp = mp;
        this.text_size_1 = text_size_1;
        this.count = count;
        this.playImage = playImage;
        this.puseImage = puseImage;
        this.forwardImage = forwardImage;
        this.rewindImage = rewindImage;
        this.zekr1 = zekr1;
        this.counterDown = counterDown;
        this.seekBar=seekBar;
        this.seekHandler=seekHandler;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zekr__elsaba7);
        ButterKnife.bind(this);
        mp = MediaPlayer.create(this, R.raw.zekr1);
        seekBar.setMax(mp.getDuration());
        Onclicks onclicks = new Onclicks(mp, text_size_1, count, playImage, puseImage, forwardImage, rewindImage, zekr1, counterDown,seekBar,seekHandler);
        init();
        onclicks.play();


    }


    public void init() {

        playImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // mp.start();
            }
        });
        puseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });
        forwardImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text_size_1 < 32) {
                    text_size_1++;
                } else {
                    Toast.makeText(Zekr_Elsaba7.this, "عذرا لا يمكنك تكبير النص اكثر من ذالك", Toast.LENGTH_SHORT).show();
                }
                zekr1.setTextSize(text_size_1);
            }
        });
        rewindImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text_size_1 > 15) {
                    text_size_1--;
                } else {
                    Toast.makeText(Zekr_Elsaba7.this, "عذرا لا يمكنك تصغير النص اكثر من ذالك", Toast.LENGTH_SHORT).show();
                }
                zekr1.setTextSize(text_size_1);
            }
        });
        for (int i = 0; i <= 9; i++) {
            try {

                counterDown.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        counterDown.setText(String.valueOf(count));
                        count--;
                        if (count <= 0) {
                            counterDown.setText("done");
                            counterDown.setBackgroundColor(Color.BLUE);
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void onStop() {
        super.onStop();
        if (mp.isPlaying()) {
            mp.pause();

        }
        Intent intent =new Intent (getApplicationContext(), MainActivity.class );
        startActivity(intent);
    }


}