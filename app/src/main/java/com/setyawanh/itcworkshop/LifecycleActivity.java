package com.setyawanh.itcworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class LifecycleActivity extends AppCompatActivity {
    TextView txtLifeCycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        txtLifeCycle = findViewById(R.id.txtLifecycle);
        setText("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        setText("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        setText("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        setText("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        setText("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setText("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setText("onDestroy");
    }

    private void setText(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        Log.i("LIFECYCLE", text);
        String str = txtLifeCycle.getText().toString() + "\n" + text;
        txtLifeCycle.setText(str);
    }

    public void finish(View v) {
        finish();
    }
}
