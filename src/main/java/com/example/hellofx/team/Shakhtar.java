package com.example.hellofx.team;

public class Shakhtar extends Teams{
    private int numberOfVoters;

    public Shakhtar(){
        super.setCountry("Ukraine");
        super.setName("Shakhtar");
        super.generateRandomNumberOfCharitableMatches();
    }
}
