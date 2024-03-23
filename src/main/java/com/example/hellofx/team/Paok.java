package com.example.hellofx.team;

public class Paok extends Teams{
    private int numberOfVoters;

    public Paok(){
        super.setCountry("Greek");
        super.setName("Paok");
        super.generateRandomNumberOfCharitableMatches();

    }
}
