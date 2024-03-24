package com.example.hellofx.voting;

import com.example.hellofx.team.Teams;

import java.util.ArrayList;

public class SecondRound extends Vote implements VotingProcess, VotingObserver{
    private ArrayList<Teams> finalists;

    public SecondRound(ArrayList<Teams> finalists) {
        for (Teams team : finalists) {
            addTeam(team);
        }
        addObserver(this);
    }

    public void addTeam(Teams team){
        this.finalists.add(team);
    }
    public void removeTeam(Teams team){
        this.finalists.remove(team);
    }
    public void startVoting(){}
    public void update(boolean isOpen){
        if(isOpen){
            System.out.println("The second round of voting has opened");
        }else{
            System.out.println("The second round of voting has closed");
        }
    }

}