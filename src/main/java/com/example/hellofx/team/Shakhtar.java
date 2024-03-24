package com.example.hellofx.team;

public class Shakhtar extends Teams{
    private int numberOfVoters;

    public Shakhtar(){
        super.setCountry("Ukraine");
        super.setName("Shakhtar");
        super.generateRandomNumberOfCharitableMatches();

        for (int i = 0; i < 11; i++) {
            Player player = new Player();
            super.addPlayer(player);
        }
    }
}
