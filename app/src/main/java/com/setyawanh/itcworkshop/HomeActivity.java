package com.setyawanh.itcworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView txtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String user = getIntent().getStringExtra("USER");
        txtUser = findViewById(R.id.txtUser);
        txtUser.setText(user);
    }
}
