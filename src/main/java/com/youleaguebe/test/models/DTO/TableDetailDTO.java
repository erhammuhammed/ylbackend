package com.youleaguebe.test.models.DTO;


public class TableDetailDTO {

    public TableDetailDTO(String teamName,Long pos, int games, int wins, int draws, int loss, int points, int gf,
            int ga, Long gd) {
        this.teamName = teamName;
        this.games = games;
        this.wins = wins;
        this.draws = draws;
        this.loss = loss;
        this.points = points;
        this.pos = pos;
        this.gf = gf;
        this.ga = ga;
        this.gd = gd;
    }

    public Long pos;

    public String teamName;

    public int games;

    public int wins;

    public int draws;

    public int loss;

    public int points;

    public int gf;

    public int ga;

    public Long gd;

    public Long getPos() {
        return pos;
    }

    public void setPos(Long pos) {
        this.pos = pos;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
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

    public Long getGd() {
        return gd;
    }

    public void setGd(Long gd) {
        this.gd = gd;
    }

}
