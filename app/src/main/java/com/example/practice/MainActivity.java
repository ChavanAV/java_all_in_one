package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button notificaiton,youtub,trd,img,frgmnt;
    TextView txtvw;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youtub=findViewById(R.id.utub);
        notificaiton=findViewById(R.id.noti);
        trd = findViewById(R.id.thread);
        img = findViewById(R.id.chgimg);
        frgmnt = findViewById(R.id.frag);
        txtvw=findViewById(R.id.tv);

        youtub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
                startActivity(i);
            }
        });

        notificaiton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Notification.class);
                startActivity(i);
            }
        });

        trd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Thread.class);
                startActivity(i);
            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ChangImage.class);
                startActivity(i);
            }
        });

        frgmnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Fragmnt.class);
                startActivity(i);
            }
        });

    }
}