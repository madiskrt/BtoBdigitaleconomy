package com.example.a210311_btobdigitaleconomy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    private Button btn_SignIn;
    private Button btn_LearnMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.insert_temp);
        setContentView(R.layout._intro_c);

        btn_SignIn = (Button) findViewById(R.id.btnSignIn);
        btn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignIn();
            }
        });

        //Activity - Learn more
        btn_LearnMore = (Button) findViewById(R.id.btnLearnMore);
        btn_LearnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLearnMore();
            }
        });

    } //onCreate ends


    public void showMenu(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu);
        popup.show();
    }

    public void openSignIn(){
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }

    public void openLearnMore(){
        Intent intent = new Intent(this, LearnMoreActivity.class);
        startActivity(intent);

    }

    public void openMyProfile(){
        setContentView(R.layout.profile);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action__home_dash_c:
                Toast.makeText(this, "Dash clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_My_Profile:
                //Toast.makeText(this, "Dash clicked", Toast.LENGTH_SHORT).show();
                openMyProfile();
                return true;
            default:
                return false;
        }
    }

}