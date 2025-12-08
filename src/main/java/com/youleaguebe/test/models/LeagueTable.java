package com.youleaguebe.test.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LeagueTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "teamId")
    public String teamId;

    @Column(name = "games")
    public int games;

    @Column(name = "wins")
    public int wins;

    @Column(name = "draws")
    public int draws;

    @Column(name = "loss")
    public int loss;

    @Column(name = "points")
    public int points;

    @Column(name = "gf")
    public int gf;

    @Column(name = "ga")
    public int ga;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public int getGa() {
        return ga;
    }

    public void setGa(int ga) {
        this.ga = ga;
    }

    @Override
    public String toString() {
        return "LeagueTable [id=" + id + ", teamId=" + teamId + ", games=" + games + ", wins=" + wins + ", draws="
                + draws + ", loss=" + loss + ", points=" + points + ", gf=" + gf + ", ga=" + ga + "]";
    }

    
}
