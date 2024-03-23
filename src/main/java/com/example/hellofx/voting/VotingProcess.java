package com.example.hellofx.voting;

import com.example.hellofx.team.Teams;

public interface VotingProcess {
    void addTeam(Teams team);
    void removeTeam(Teams team);
    void startVoting();
}
