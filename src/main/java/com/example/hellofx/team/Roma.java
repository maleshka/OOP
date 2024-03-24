package com.example.hellofx.team;

public class Roma extends Teams{
    private int numberOfVoters;

    public Roma(){
        super.setCountry("Italian");
        super.setName("Roma");
        super.generateRandomNumberOfCharitableMatches();

        for (int i = 0; i < 11; i++) {
            Player player = new Player();
            super.addPlayer(player);
        }
    }
}
