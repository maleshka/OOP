package com.example.hellofx.manager;

import java.util.ArrayList;
import com.example.hellofx.team.*;
import com.example.hellofx.voting.Vote;

public class Manager {
    private static Manager ma;
    private ArrayList<Teams> teams;
    private Vote vote;



    private Manager(){
        createTeams();
    }

    public static Manager getInstance(){
        if(ma ==null){
            ma = new Manager();
        }
        return ma;
    }

    public void createTeams(){

        teams=new ArrayList<>();

        Teams ajax = new Ajax();
        this.teams.add(ajax);

        Teams bayern = new Bayern();
        this.teams.add(bayern);

        Teams dynamo = new Dynamo();
        this.teams.add(dynamo);

        Teams liverpool= new Liverpool();
        this.teams.add(liverpool);

        Teams manchesterCity = new ManchesterCity();
        this.teams.add(manchesterCity);

        Teams marseille = new Marseille();
        this.teams.add(marseille);

        Teams paok = new Paok();
        this.teams.add(paok);

        Teams realMadrid = new RealMadrid();
        this.teams.add(realMadrid);

        Teams roma = new Roma();
        this.teams.add(roma);

        Teams shakhtar = new Shakhtar();
        this.teams.add(shakhtar);
    }
}
