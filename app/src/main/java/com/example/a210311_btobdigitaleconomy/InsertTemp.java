package com.example.a210311_btobdigitaleconomy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InsertTemp extends AppCompatActivity {

    EditText insName;
    EditText insRank;
    Spinner spinnerIndustry;
    Button btnInsert;

    DatabaseReference startupDbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_temp);

        insName = findViewById(R.id.insName);
        insRank = findViewById(R.id.insRank);
        spinnerIndustry = findViewById(R.id.spinnerIndustry);
        btnInsert = findViewById(R.id.btnInsert);

        //startupDbRef = FirebaseDatabase.getInstance().getReference();
        startupDbRef = FirebaseDatabase.getInstance().getReference().child("Startups"); //can use any name, it's database name
        Log.d("logging", String.valueOf(startupDbRef));

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertStartupData();
            }
        });

    }

    private void insertStartupData() {

        String name = insName.getText().toString();
        String rank = insRank.getText().toString();
        String industry = spinnerIndustry.getSelectedItem().toString();
        Log.d("logging: name", name);
        Log.d("logging: rank", rank);
        Log.d("logging: industry", industry);
        //created class Startups
        //now create Startups class obj
        Startups startups = new Startups(name,industry,rank);

        //setValue accepts only object
        startupDbRef.setValue("Hello");
        startupDbRef.push().setValue(startups); //unique key/id for every record

    }


}