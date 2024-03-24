package com.example.hellofx.team;

public class Liverpool extends Teams{
    private int numberOfVoters;

    public Liverpool(){
        super.setCountry("England");
        super.setName("Liverpool");
        super.generateRandomNumberOfCharitableMatches();

        for (int i = 0; i < 11; i++) {
            Player player = new Player();
            super.addPlayer(player);
        }
    }

    public int getNumberOfVoters() {
        return numberOfVoters;
    }

    public void setNumberOfVoters(int numberOfVoters) {
        this.numberOfVoters = numberOfVoters;
    }
}
