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
    private Button intro_sign_in;
    private Button insert;
    private Button lmButton;
    private Button list; //

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

        /*insert = (Button) findViewById(R.id.btn_signIn_lm);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignIn();
            }
        });*/

        //Activity - Learn more
        lmButton = (Button) findViewById(R.id.lmButton);
        lmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlmButton();
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

    public void showMenu(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu);
        popup.show();
    }

    private void openInsertTemp() {
        Intent intent = new Intent(this, InsertTemp.class);
        startActivity(intent);
    }

    public void openSignIn(){
        /*Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);*/
        setContentView(R.layout._sign_in_c);
    }

    public void openlmButton(){
        /*Intent intent = new Intent(this, activity_menu.class);
        startActivity(intent);*/
        setContentView(R.layout._learn_more_c);
    }

    public void openMyProfile(){
        setContentView(R.layout.profile);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action__home_dash_c:
                //Toast.makeText(this, "Dash clicked", Toast.LENGTH_SHORT).show();
                openInsertTemp();
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