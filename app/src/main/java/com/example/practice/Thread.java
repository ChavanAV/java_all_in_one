package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Thread extends AppCompatActivity {

    TextView tv2;
    EditText ed;
    Button enter,clear;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thread);

        enter=(Button) findViewById(R.id.entr);
        clear=(Button) findViewById(R.id.clr);
        ed=(EditText) findViewById(R.id.editTextTextPersonName);
        tv2=(TextView) findViewById(R.id.trdtv);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText("");
                tv2.setText("");
            }
        });
    }

    private void thread() {
        String s=ed.getText().toString();
        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv2.setText(s);
                    }
                });
            }
        },3000
        );
    }
}