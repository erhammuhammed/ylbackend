package com.youleaguebe.test.models.DTO;

import java.time.LocalDate;

public class FixtureDto {

    public int matchId;
    public int home_goals;
    public int away_goals;
    public LocalDate time;
    public boolean finished;
    public String homeTeam;
    public String awayTeam;
    public FixtureDto(int matchId,int home_goals, int away_goals, LocalDate time, boolean finished, String homeTeam, String awayTeam) {
        this.matchId = matchId;
        this.home_goals = home_goals;
        this.away_goals = away_goals;
        this.time = time;
        this.finished = finished;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
    public int getHome_goals() {
        return home_goals;
    }
    public void setHome_goals(int home_goals) {
        this.home_goals = home_goals;
    }
    public int getAway_goals() {
        return away_goals;
    }
    public void setAway_goals(int away_goals) {
        this.away_goals = away_goals;
    }
    public LocalDate getTime() {
        return time;
    }
    public void setTime(LocalDate time) {
        this.time = time;
    }
    public boolean isFinished() {
        return finished;
    }
    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    public String getHomeTeam() {
        return homeTeam;
    }
    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }
    public String getAwayTeam() {
        return awayTeam;
    }
    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }
    public int getMatchId() {
        return matchId;
    }
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    
}
