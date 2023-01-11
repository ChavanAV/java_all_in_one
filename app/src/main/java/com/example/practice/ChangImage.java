package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChangImage extends AppCompatActivity {

    Button chng;
    ImageView iv;
    boolean isImg;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chang_image);

        chng = findViewById(R.id.chn);
        iv = findViewById(R.id.imageView2);

        chng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isImg=!isImg;
                if(isImg){
                    iv.setImageResource(R.drawable.iimg1);
                }
                else {
                    iv.setImageResource(R.drawable.img3);
                }
            }
        });

    }
}