package com.example.hellofx.team;

public class Marseille extends Teams{
    private int numberOfVoters;

    public Marseille(){
        super.setCountry("France");
        super.setName("Marseille");
        super.generateRandomNumberOfCharitableMatches();

        for (int i = 0; i < 11; i++) {
            Player player = new Player();
            super.addPlayer(player);
        }
    }
}
