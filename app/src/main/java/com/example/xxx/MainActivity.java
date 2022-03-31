package com.example.xxx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Second = (TextView) findViewById(R.id.Second);
        CountDownTimer my_time = new CountDownTimer(30000,1000)
        {
            @Override
            public void onTick(long millislnfinish)
            {
                Second.setText(Long.toString(millislnfinish));
            }

            @Override
            public void onFinish()
            {

            }
        };


    }

    public void doWeb(View view){
        Intent intent = new Intent(this,MainActivityweb.class);
        startActivity(intent);
    }
    public void doWeb2(View view){
        Intent intent = new Intent(this,MainActivityweb2.class);
        startActivity(intent);
    }
}