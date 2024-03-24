package com.example.hellofx.team;

public class Paok extends Teams{
    private int numberOfVoters;

    public Paok(){
        super.setCountry("Greek");
        super.setName("Paok");
        super.generateRandomNumberOfCharitableMatches();

        for (int i = 0; i < 11; i++) {
            Player player = new Player();
            super.addPlayer(player);
        }
    }
}
