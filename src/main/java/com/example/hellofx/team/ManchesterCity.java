package com.example.hellofx.team;

public class ManchesterCity extends Teams{
    private int numberOfVoters;

    public ManchesterCity(){
        super.setCountry("England");
        super.setName("ManchesterCity");
        super.generateRandomNumberOfCharitableMatches();

    }
}
