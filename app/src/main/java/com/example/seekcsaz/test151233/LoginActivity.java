package com.example.seekcsaz.test151233;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button mLogin;
    private Button mCancel;
    private EditText eLogin;
    private EditText ePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eLogin= (EditText) findViewById(R.id.logintxt);
        ePassword= (EditText) findViewById(R.id.passwordtxt);
        mLogin = (Button) findViewById(R.id.login);
        mCancel = (Button) findViewById(R.id.cancel_action);

        mLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (eLogin.getText().toString().equals("username")&&
                       ePassword.getText().toString().equals("password")){
                        startActivity(new Intent(getApplicationContext(), WelcomeActivity.class));
               }
               else {
                   Toast.makeText(LoginActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
               }
           }
       });
        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
