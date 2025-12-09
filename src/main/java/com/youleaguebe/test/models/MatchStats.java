package com.youleaguebe.test.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "match_stats")
public class MatchStats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "playerId")
    public int playerId;

    @Column(name = "teamId")
    public int teamId;

    @Column(name = "goal")
    public boolean goal;

    @Column(name = "assist")
    public boolean assist;

    @Column(name = "cleansheet")
    public boolean cleansheet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public boolean isGoal() {
        return goal;
    }

    public void setGoal(boolean goal) {
        this.goal = goal;
    }

    public boolean isAssist() {
        return assist;
    }

    public void setAssist(boolean assist) {
        this.assist = assist;
    }

    public boolean isCleansheet() {
        return cleansheet;
    }

    public void setCleansheet(boolean cleansheet) {
        this.cleansheet = cleansheet;
    }


}
