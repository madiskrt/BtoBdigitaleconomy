package com.example.a210311_btobdigitaleconomy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnMoreActivity extends AppCompatActivity {

    private Button btn_SignIn;
    private Button btn_GetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._learn_more_c);

        //Activity - Learn more
        btn_GetStarted = (Button) findViewById(R.id.btnGetStarted);
        btn_GetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGetStarted();
            }
        });

        btn_SignIn = (Button) findViewById(R.id.btnSignIn);
        btn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignIn();
            }
        });
    }

    public void openSignIn(){
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }

    public void openGetStarted(){
        Intent intent = new Intent(this, GetStartedActivity.class);
        startActivity(intent);
    }
}