package com.oreilly.entities;

import javax.sql.DataSource;

/**
 * Created by deepakvalechha on 3/4/16.
 */
public class BaseballGame implements Game {
    private Team homeTeam;
    private Team awayTeam;
    private DataSource dataSource;

    public BaseballGame(){}

    public BaseballGame(Team homeTeam, Team awayTeam, DataSource dataSource) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.dataSource = dataSource;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public String playGame() {
        return Math.random() < 0.5 ? getHomeTeam().getName() : getAwayTeam().getName();
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void init() {
        System.out.println("Init time");
    }

    public void destroy() {
        System.out.println("Destroy time");
    }

    @Override
    public String toString() {
        return String.format("Game between %s at %s", awayTeam.getName(), homeTeam.getName());
    }
}
