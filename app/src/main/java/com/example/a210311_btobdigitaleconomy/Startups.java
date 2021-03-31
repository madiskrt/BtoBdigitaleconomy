package com.example.a210311_btobdigitaleconomy;

import android.util.Log;

public class Startups {

    String name;
    String industry;
    String rank;

    //constructor
    public Startups(String name, String industry, String rank) {
        Log.d("logging", "constructor Startups");
        this.name = name;
        this.industry = industry;
        this.rank = rank;
    }

    //getters
    public String getName() {
        return name;
    }
    public String getIndustry() {
        return industry;
    }
    public String getRank() {
        return rank;
    }
}
