package com.example.hellofx.team;

public class ManchesterCity extends Teams{
    private int numberOfVoters;

    public ManchesterCity(){
        super.setCountry("England");
        super.setName("ManchesterCity");
        super.generateRandomNumberOfCharitableMatches();

        for (int i = 0; i < 11; i++) {
            Player player = new Player();
            super.addPlayer(player);
        }
    }
}
