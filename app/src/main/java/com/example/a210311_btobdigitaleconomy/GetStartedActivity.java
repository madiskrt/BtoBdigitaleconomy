package com.example.a210311_btobdigitaleconomy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStartedActivity extends AppCompatActivity {

    private Button btn_SignUpInvestor;
    private Button btn_BackGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout._get_started);

        btn_BackGetStarted = (Button) findViewById(R.id.btnBackGetStarted);
        btn_BackGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLearnMore();
            }
        });

        btn_SignUpInvestor = (Button) findViewById(R.id.btnSignUpInvestor);
        btn_SignUpInvestor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignIn();
            }
        });

    }

    public void openLearnMore(){
        Intent intent = new Intent(this, LearnMoreActivity.class);
        startActivity(intent);

    }

    public void openSignIn(){
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }
}