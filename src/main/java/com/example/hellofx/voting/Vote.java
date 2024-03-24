package com.example.hellofx.voting;

import java.util.ArrayList;

public class Vote {
    private boolean isOpen;
    private final ArrayList<VotingObserver> observers = new ArrayList<>();


    public void notifyObservers(){
        for(VotingObserver observers :observers){
            observers.update(isOpen);
        }
    }

    public void addObserver(VotingObserver observer){
        observers.add(observer);
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
        notifyObservers();
    }
}
