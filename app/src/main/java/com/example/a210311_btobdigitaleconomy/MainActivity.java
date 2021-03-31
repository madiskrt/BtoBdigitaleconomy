package com.example.a210311_btobdigitaleconomy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button intro_sign_in;
    private Button insert;
    private Button list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.insert_temp);
        setContentView(R.layout._intro_c);

        intro_sign_in = (Button) findViewById(R.id.intro_sign_in);
        intro_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignIn();
            }
        });

        insert = (Button) findViewById(R.id.insert);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsertTemp();
            }
        });

        /*list = (Button) findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openList();
            }
        });*/

    } //onCreate ends

    /*private void openList() {
        Intent intent = new Intent(this, MyList.class);
        startActivity(intent);
    }*/

    private void openInsertTemp() {
        Intent intent = new Intent(this, InsertTemp.class);
        startActivity(intent);
    }

    public void openSignIn(){
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);

    }
}