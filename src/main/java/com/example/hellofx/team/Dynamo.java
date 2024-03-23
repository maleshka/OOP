package com.example.hellofx.team;

public class Dynamo extends Teams{
    private int numberOfVoters;

    public Dynamo(){
        super.setCountry("Ukraine");
        super.setName("Dynamo");
        super.generateRandomNumberOfCharitableMatches();
    }
}
