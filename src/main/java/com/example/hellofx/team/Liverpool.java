package com.example.hellofx.team;

public class Liverpool extends Teams{
    private int numberOfVoters;

    public Liverpool(){
        super.setCountry("England");
        super.setName("Liverpool");
        super.generateRandomNumberOfCharitableMatches();
    }
}
