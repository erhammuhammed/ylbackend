package com.youleaguebe.test.models.DTO;

public class PlayerInfoDto {

    public String name;

    public String team;

    public int games;

    public int goal;

    public int assist;

    public PlayerInfoDto(String name, String team, int games, int goal, int assist) {
        this.name = name;
        this.team = team;
        this.games = games;
        this.goal = goal;
        this.assist = assist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    

}
