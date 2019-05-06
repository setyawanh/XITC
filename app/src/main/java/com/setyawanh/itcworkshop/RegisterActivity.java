package com.setyawanh.itcworkshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private EditText edtUser, edtPass, edtConfirmPass;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtPass);
        edtConfirmPass = findViewById(R.id.edtConfirmPass);
        btnRegister = findViewById(R.id.btnRegister);

    }

    public void doRegister(View v) {
        String user = edtUser.getText().toString();
        String pass = edtPass.getText().toString();
        String confirmPass = edtConfirmPass.getText().toString();

        if (pass.equals(confirmPass)) {
            Toast.makeText(this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(RegisterActivity.this, HomeActivity.class);
            i.putExtra("USER", user);
            startActivity(i);
        } else {
            Toast.makeText(this, "Password tidak sama", Toast.LENGTH_SHORT).show();
        }

    }
}
