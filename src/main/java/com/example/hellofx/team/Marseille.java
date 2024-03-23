package com.example.hellofx.team;

public class Marseille extends Teams{
    private int numberOfVoters;

    public Marseille(){
        super.setCountry("France");
        super.setName("Marseille");
        super.generateRandomNumberOfCharitableMatches();

    }
}
