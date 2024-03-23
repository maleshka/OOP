package com.example.hellofx.team;

public class Bayern extends Teams{
    private int numberOfVoters;

    public Bayern(){
        super.setCountry("Germany");
        super.setName("Bayern");
        super.generateRandomNumberOfCharitableMatches();
    }
}
