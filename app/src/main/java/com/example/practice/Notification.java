package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Notification extends AppCompatActivity {

    Button notify;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);

        notify = findViewById(R.id.getnotify);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationManager nm =getSystemService(NotificationManager.class);
            NotificationChannel ch = new NotificationChannel("Notify","Notificaiton",NotificationManager.IMPORTANCE_DEFAULT);
            nm.createNotificationChannel(ch);
        }


        notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(Notification.this,"Notify")
                        .setContentText("Alert")
                        .setContentTitle("New Message")
                        .setSmallIcon(R.drawable.download)
                        .setAutoCancel(true);
                NotificationManagerCompat nmc = NotificationManagerCompat.from(Notification.this);
                nmc.notify(1,builder.build());
            }
        });
    }
}