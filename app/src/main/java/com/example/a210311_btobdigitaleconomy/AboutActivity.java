package com.example.a210311_btobdigitaleconomy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    private Button btn_closeAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._about);

        btn_closeAbout = (Button) findViewById(R.id.closeAbout);
        btn_closeAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeDash();
            }
        });

    }

    private void openHomeDash() {
        Intent intent = new Intent(this, HomeDashboard.class);
        startActivity(intent);
    }

}