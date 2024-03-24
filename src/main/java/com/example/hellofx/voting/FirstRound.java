package com.example.hellofx.voting;

import com.example.hellofx.team.Teams;

import java.util.ArrayList;

public class FirstRound extends Vote implements VotingProcess, VotingObserver{
    private ArrayList<Teams> candidates;

    public FirstRound(ArrayList<Teams> candidates) {
        for(Teams team: candidates){
            addTeam(team);
        }
        addObserver(this);
    }


    public void addTeam(Teams team){
        this.candidates.add(team);
    }
    public void removeTeam(Teams team){
        this.candidates.remove(team);
    }
    public void startVoting(){}

    public void update(boolean isOpen){
        if(isOpen){
            System.out.println("The first round of voting has opened");
        }else{
            System.out.println("The first round of voting has closed");
        }
    }

}