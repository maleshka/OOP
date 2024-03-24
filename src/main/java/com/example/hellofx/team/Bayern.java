package com.example.hellofx.team;

public class Bayern extends Teams{
    private int numberOfVoters;

    public Bayern(){
        super.setCountry("Germany");
        super.setName("Bayern");
        super.generateRandomNumberOfCharitableMatches();

        for (int i = 0; i < 11; i++) {
            Player player = new Player();
            super.addPlayer(player);
        }
    }
}
