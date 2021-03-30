package com.example.a210311_btobdigitaleconomy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class RetrieveDataActivity extends AppCompatActivity {

    ListView myListView;
    List<Startups> startupsList;
    DatabaseReference startupDbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("logging", "onCreate(Bundle savedInstanceState)");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve_data);

        myListView = findViewById(R.id.myListView);
        startupsList = new ArrayList<>();

        startupDbRef = FirebaseDatabase.getInstance().getReference("Startup");

        startupDbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                startupsList.clear();

                for(DataSnapshot startupDatasnap : snapshot.getChildren()){
                    Log.d("logging", "snapshot.getChildren()");
                    Startups startups = startupDatasnap.getValue(Startups.class);
                    startupsList.add(startups);
                }

                ListAdapter adapter = new ListAdapter(RetrieveDataActivity.this, startupsList);
                myListView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}