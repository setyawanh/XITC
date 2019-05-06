package com.setyawanh.itcworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {
    int mCount = 0;
    private TextView txtCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        txtCount = findViewById(R.id.txt_count);
    }

    public void addCount(View v) {
        mCount++;
        txtCount.setText(String.valueOf(mCount));
    }

    public void resetCount(View v) {
        mCount = 0;
        txtCount.setText(String.valueOf(mCount));
    }
}
