package com.example.task_2_inputdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String message = intent.getStringExtra(EXTRA_MESSAGE);

        TextView ViewMessage = findViewById(R.id.txtViewMessage);
        ViewMessage.setText(message);

    }
}
