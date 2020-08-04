package com.example.azkar.Masa2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.azkar.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public  class Azkar_Elmasa2 extends AppCompatActivity{




        @BindView(R.id.zekr_1)
        TextView zekr1;
        @BindView(R.id.seekBar_1)
        SeekBar seekBar1;
        @BindView(R.id.play_image_1)
        ImageButton playImage1;
        @BindView(R.id.puse_image_1)
        ImageButton puseImage1;
        @BindView(R.id.plus_image_1)
        ImageButton plusImage1;
        @BindView(R.id.minus_image_1)
        ImageButton minusImage1;
        @BindView(R.id.counter_down_1)
        Button counterDown1;
        @BindView(R.id.zekr_2)
        TextView zekr2;
        @BindView(R.id.seekBar_2)
        SeekBar seekBar2;
        @BindView(R.id.play_image_2)
        ImageButton playImage2;
        @BindView(R.id.puse_image2)
        ImageButton puseImage2;
        @BindView(R.id.plus_image_2)
        ImageButton plusImage2;
        @BindView(R.id.minus_image_2)
        ImageButton minusImage2;
        @BindView(R.id.counter_down_2)
        Button counterDown2;
        @BindView(R.id.zekr_3)
        TextView zekr3;
        @BindView(R.id.seekBar_3)
        SeekBar seekBar3;
        @BindView(R.id.play_image_3)
        ImageButton playImage3;
        @BindView(R.id.puse_image_3)
        ImageButton puseImage3;
        @BindView(R.id.plus_image_3)
        ImageButton plusImage3;
        @BindView(R.id.minus_image_3)
        ImageButton minusImage3;
        @BindView(R.id.counter_down_3)
        Button counterDown3;
        @BindView(R.id.zekr_4)
        TextView zekr4;
        @BindView(R.id.seekBar_4)
        SeekBar seekBar4;
        @BindView(R.id.play_image_4)
        ImageButton playImage4;
        @BindView(R.id.puse_image_4)
        ImageButton puseImage4;
        @BindView(R.id.plus_image_4)
        ImageButton plusImage4;
        @BindView(R.id.minus_image_4)
        ImageButton minusImage4;
        @BindView(R.id.counter_down_4)
        Button counterDown4;
        @BindView(R.id.zekr_5)
        TextView zekr5;
        @BindView(R.id.seekBar_5)
        SeekBar seekBar5;
        @BindView(R.id.play_image_5)
        ImageButton playImage5;
        @BindView(R.id.puse_image_5)
        ImageButton puseImage5;
        @BindView(R.id.plus_image_5)
        ImageButton plusImage5;
        @BindView(R.id.minus_image_5)
        ImageButton minusImage5;
        @BindView(R.id.counter_down_5)
        Button counterDown5;
        @BindView(R.id.zekr_6)
        TextView zekr6;
        @BindView(R.id.seekBar_6)
        SeekBar seekBar6;
        @BindView(R.id.play_image_6)
        ImageButton playImage6;
        @BindView(R.id.puse_image_6)
        ImageButton puseImage6;
        @BindView(R.id.plus_image_6)
        ImageButton plusImage6;
        @BindView(R.id.minus_image_6)
        ImageButton minusImage6;
        @BindView(R.id.counter_down_6)
        Button counterDown6;
        @BindView(R.id.zekr_7)
        TextView zekr7;
        @BindView(R.id.seekBar_7)
        SeekBar seekBar7;
        @BindView(R.id.play_image_7)
        ImageButton playImage7;
        @BindView(R.id.puse_image_7)
        ImageButton puseImage7;
        @BindView(R.id.plus_image_7)
        ImageButton plusImage7;
        @BindView(R.id.minus_image_7)
        ImageButton minusImage7;
        @BindView(R.id.counter_down_7)
        Button counterDown7;
        @BindView(R.id.zekr_8)
        TextView zekr8;
        @BindView(R.id.seekBar_8)
        SeekBar seekBar8;
        @BindView(R.id.play_image_8)
        ImageButton playImage8;
        @BindView(R.id.puse_image_8)
        ImageButton puseImage8;
        @BindView(R.id.plus_image_8)
        ImageButton plusImage8;
        @BindView(R.id.minus_image_8)
        ImageButton minusImage8;
        @BindView(R.id.counter_down_8)
        Button counterDown8;
        @BindView(R.id.zekr_9)
        TextView zekr9;
        @BindView(R.id.seekBar_9)
        SeekBar seekBar9;
        @BindView(R.id.play_image_9)
        ImageButton playImage9;
        @BindView(R.id.puse_image_9)
        ImageButton puseImage9;
        @BindView(R.id.plus_image_9)
        ImageButton plusImage9;
        @BindView(R.id.minus_image_9)
        ImageButton minusImage9;
        @BindView(R.id.counter_down_9)
        Button counterDown9;
        @BindView(R.id.zekr_10)
        TextView zekr10;
        @BindView(R.id.seekBar_10)
        SeekBar seekBar10;
        @BindView(R.id.play_image_10)
        ImageButton playImage10;
        @BindView(R.id.puse_image_10)
        ImageButton puseImage10;
        @BindView(R.id.plus_image_10)
        ImageButton plusImage10;
        @BindView(R.id.minus_image_10)
        ImageButton minusImage10;
        @BindView(R.id.counter_down_10)
        Button counterDown10;
        @BindView(R.id.zekr_11)
        TextView zekr11;
        @BindView(R.id.seekBar_11)
        SeekBar seekBar11;
        @BindView(R.id.play_image_11)
        ImageButton playImage11;
        @BindView(R.id.puse_image_11)
        ImageButton puseImage11;
        @BindView(R.id.plus_image_11)
        ImageButton plusImage11;
        @BindView(R.id.minus_image_11)
        ImageButton minusImage11;
        @BindView(R.id.counter_down_11)
        Button counterDown11;
        @BindView(R.id.zekr_12)
        TextView zekr12;
        @BindView(R.id.seekBar_12)
        SeekBar seekBar12;
        @BindView(R.id.play_image_12)
        ImageButton playImage12;
        @BindView(R.id.puse_image_12)
        ImageButton puseImage12;
        @BindView(R.id.plus_image_12)
        ImageButton plusImage12;
        @BindView(R.id.minus_image_12)
        ImageButton minusImage12;
        @BindView(R.id.counter_down_12)
        Button counterDown12;
        @BindView(R.id.zekr_13)
        TextView zekr13;
        @BindView(R.id.seekBar_13)
        SeekBar seekBar13;
        @BindView(R.id.play_image_13)
        ImageButton playImage13;
        @BindView(R.id.puse_image_13)
        ImageButton puseImage13;
        @BindView(R.id.plus_image_13)
        ImageButton plusImage13;
        @BindView(R.id.minus_image_13)
        ImageButton minusImage13;
        @BindView(R.id.counter_down_13)
        Button counterDown13;
        @BindView(R.id.zekr_14)
        TextView zekr14;
        @BindView(R.id.seekBar_14)
        SeekBar seekBar14;
        @BindView(R.id.play_image_14)
        ImageButton playImage14;
        @BindView(R.id.puse_image_14)
        ImageButton puseImage14;
        @BindView(R.id.plus_image_14)
        ImageButton plusImage14;
        @BindView(R.id.minus_image_14)
        ImageButton minusImage14;
        @BindView(R.id.counter_down_14)
        Button counterDown14;
        @BindView(R.id.zekr_15)
        TextView zekr15;
        @BindView(R.id.seekBar_15)
        SeekBar seekBar15;
        @BindView(R.id.play_image_15)
        ImageButton playImage15;
        @BindView(R.id.puse_image_15)
        ImageButton puseImage15;
        @BindView(R.id.plus_image_15)
        ImageButton plusImage15;
        @BindView(R.id.minus_image_15)
        ImageButton minusImage15;
        @BindView(R.id.counter_down_15)
        Button counterDown15;
        @BindView(R.id.zekr_16)
        TextView zekr16;
        @BindView(R.id.seekBar_16)
        SeekBar seekBar16;
        @BindView(R.id.play_image_16)
        ImageButton playImage16;
        @BindView(R.id.puse_image_16)
        ImageButton puseImage16;
        @BindView(R.id.plus_image_16)
        ImageButton plusImage16;
        @BindView(R.id.minus_image_16)
        ImageButton minusImage16;
        @BindView(R.id.counter_down_16)
        Button counterDown16;
        @BindView(R.id.zekr_17)
        TextView zekr17;
        @BindView(R.id.seekBar_17)
        SeekBar seekBar17;
        @BindView(R.id.play_image_17)
        ImageButton playImage17;
        @BindView(R.id.puse_image_17)
        ImageButton puseImage17;
        @BindView(R.id.plus_image_17)
        ImageButton plusImage17;
        @BindView(R.id.minus_image_17)
        ImageButton minusImage17;
        @BindView(R.id.counter_down_17)
        Button counterDown17;
        @BindView(R.id.zekr_18)
        TextView zekr18;
        @BindView(R.id.seekBar_18)
        SeekBar seekBar18;
        @BindView(R.id.play_image_18)
        ImageButton playImage18;
        @BindView(R.id.puse_image_18)
        ImageButton puseImage18;
        @BindView(R.id.plus_image_18)
        ImageButton plusImage18;
        @BindView(R.id.minus_image_18)
        ImageButton minusImage18;
        @BindView(R.id.counter_down_18)
        Button counterDown18;
        @BindView(R.id.zekr_19)
        TextView zekr19;
        @BindView(R.id.seekBar_19)
        SeekBar seekBar19;
        @BindView(R.id.play_image_19)
        ImageButton playImage19;
        @BindView(R.id.puse_image_19)
        ImageButton puseImage19;
        @BindView(R.id.plus_image_19)
        ImageButton plusImage19;
        @BindView(R.id.minus_image_19)
        ImageButton minusImage19;
        @BindView(R.id.counter_down_19)
        Button counterDown19;
        int default_txt_size=22;
        ImageButton[]playimageButtons;
        MediaPlayer mp1;
        int position =0;
        int []audio_res_id;
        play_audio_controller playAudioController;

    public Azkar_Elmasa2(int default_txt_size, ImageButton[] playimageButtons, MediaPlayer mp1, int position, int[] audio_res_id) {
        this.default_txt_size = default_txt_size;
        this.playimageButtons = playimageButtons;
        this.mp1 = mp1;
        this.position = position;
        this.audio_res_id = audio_res_id;
    }


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_zekr__elmasa2);
            ButterKnife.bind( this);
play_audio_controller playAudioController=new play_audio_controller(default_txt_size,playimageButtons,
                                                                                       mp1,position,audio_res_id);
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




        protected void onStop() {
            super.onStop();
            if (mp1.isPlaying()) {
                mp1.pause();

            }
        }


    }


