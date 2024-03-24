package com.example.hellofx.team;

import java.util.Random;

public class Player {
    private String name;
    private int redCards;
    private int yellowCards;
    private int trophiesWon;

    public Player() {
        this.redCards = randomGenerateCards();
        this.yellowCards = randomGenerateCards();
        this.trophiesWon=randomGenerateTrophiesWon();
    }

    public int randomGenerateCards() {
        int count;
        Random random = new Random();
        count = random.nextInt(25);
        return count;
    }

    public int randomGenerateTrophiesWon(){
        int count;
        Random random = new Random();
        count = random.nextInt(10);
        return count;
    }
}
