package com.oreilly.entities;

/**
 * Created by deepakvalechha on 3/4/16.
 */
public interface Game {
    void setHomeTeam(Team team);
    Team getHomeTeam();
    void setAwayTeam(Team team);
    Team getAwayTeam();
    String playGame();
}
