package com.example.a210311_btobdigitaleconomy;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._profile);
        }

    public void showMenu(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu);
        popup.show();
    }

    private void openHomeDash() {
        Intent intent = new Intent(this, HomeDashboard.class);
        startActivity(intent);
    }

    public void openSignIn(){
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }

    public void openAbout(){
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void openMyProjects(){
        Intent intent = new Intent(this, MyProjectsActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuHomeDash:
                openHomeDash();
                return true;
            case R.id.menuAbout:
                openAbout();
                return true;
            case R.id.menuLogOut:
                openSignIn();
                return true;
            case R.id.menuMyProjects:
                openMyProjects();
                return true;
            default:
                return false;
        }
    }

}
