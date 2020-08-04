package com.example.azkar.Masa2;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;

import com.example.azkar.R;


public class play_audio_controller extends Azkar_Elmasa2 implements View.OnClickListener {
    public play_audio_controller(int default_txt_size, ImageButton[] playimageButtons, MediaPlayer mp1, int position, int[] audio_res_id) {
        super(default_txt_size, playimageButtons, mp1, position, audio_res_id);
    }


    public void play() {
        this.audio_res_id= new int[]{R.raw.zekr1, R.raw.zekr2, R.raw.zekr3, R.raw.zekr4};
        this.position=0;
        this.mp1=MediaPlayer.create(getApplicationContext(),audio_res_id[position]);
          playImage1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  mp1.start();

              }
          });

    }

    @Override
    public void onClick(View v) {
        play();
        switch(v.getId()){
            case R.id.play_image_1:   {
                this.mp1=MediaPlayer.create(getApplicationContext(),audio_res_id[0]);
                mp1.start();
            }

    }
    }
}
