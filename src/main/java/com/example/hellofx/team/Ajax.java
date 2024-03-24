package com.example.hellofx.team;

public class Ajax extends Teams{
    private int numberOfVoters;
    public Ajax(){
        super.setCountry("Netherlands");
        super.setName("Ajax");
        super.generateRandomNumberOfCharitableMatches();

        for (int i = 0; i < 11; i++) {
            Player player = new Player();
            super.addPlayer(player);
        }
    }
}