package com.example.a210311_btobdigitaleconomy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInActivity extends AppCompatActivity {

    private Button signin;
    private Button btn_BackSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._sign_in_c);

        signin = (Button) findViewById(R.id.btnSignin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeDash();
            }
        });

        btn_BackSignIn = (Button) findViewById(R.id.btnBackSignIn);
        btn_BackSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLearnMore();
            }
        });


    }

    private void openHomeDash() {
        Intent intent = new Intent(this, HomeDashboard.class);
        startActivity(intent);
    }

    public void openLearnMore(){
        Intent intent = new Intent(this, LearnMoreActivity.class);
        startActivity(intent);

    }
}