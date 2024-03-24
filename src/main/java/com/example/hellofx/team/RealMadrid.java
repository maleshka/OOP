package com.example.hellofx.team;

public class RealMadrid extends Teams{
    private int numberOfVoters;

    public RealMadrid(){
        super.setCountry("Spain");
        super.setName("RealMadrid");
        super.generateRandomNumberOfCharitableMatches();

        for (int i = 0; i < 11; i++) {
            Player player = new Player();
            super.addPlayer(player);
        }
    }
}
