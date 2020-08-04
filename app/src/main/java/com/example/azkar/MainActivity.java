package com.example.azkar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.azkar.Masa2.Azkar_Elmasa2;
import com.example.azkar.Saba7.Zekr_Elsaba7;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {


    @BindView(R.id.zekr_sabah)
    Button zekrSabah;
    @BindView(R.id.zekr_masaa)
    Button zekrMasaa;
    @BindView(R.id.about_app)
    Button aboutApp;
    @BindView(R.id.close_app)
    Button closeApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        zekrSabah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Zekr_Elsaba7.class);
                startActivity(intent);
            }
        });
        zekrSabah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Azkar_Elmasa2.class);
                startActivity(intent);
            }
        });


    }


    }







