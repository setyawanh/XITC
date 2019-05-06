package com.setyawanh.itcworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView header;
    Long lastTime = 0L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        header = findViewById(R.id.tv_header);

        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "CUK", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void goToCounter(View v) {
        Intent i = new Intent(this,CountActivity.class);
        startActivity(i);
    }

    public void goToLogin(View v) {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }

    public void goToLifecycle(View v) {
        Intent i = new Intent(this,LifecycleActivity.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        Long now = Calendar.getInstance().getTimeInMillis();
        if (now - lastTime < 2000) {
            finish();
        } else {
            lastTime = now;
            Toast.makeText(this, "Tekan sekali lagi untuk keluar", Toast.LENGTH_SHORT).show();
        }

    }
}
