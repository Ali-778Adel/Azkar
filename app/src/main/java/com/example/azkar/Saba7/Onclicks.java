package com.example.azkar.Saba7;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import com.example.azkar.R;

import static com.example.azkar.R.raw.*;

public class Onclicks extends Zekr_Elsaba7  {
    public Onclicks(){
    }
    public Onclicks(MediaPlayer mp, int text_size_1, int count, ImageButton playImage, ImageButton puseImage, ImageButton forwardImage,
                    ImageButton rewindImage, TextView zekr1, Button counterDown, SeekBar seekBar, Handler seekHandler) {
        super(mp, text_size_1, count, playImage, puseImage, forwardImage, rewindImage, zekr1, counterDown,seekBar,seekHandler);
    }
    Runnable run =new Runnable() {
            @Override
            public void run() {
          seekUpdation();
            }
        };
    public void seekUpdation() {
seekBar.setProgress(mp.getCurrentPosition());
seekHandler.postDelayed(run,1000);
    }

  public void play(){
        run.run();
        ImageButton[]x={playImage,puseImage,forwardImage,rewindImage};
    x[0].setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();

        }
    });
}


}

