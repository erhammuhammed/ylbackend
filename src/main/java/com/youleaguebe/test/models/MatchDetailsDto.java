package com.youleaguebe.test.models;



public class MatchDetailsDto {
    
    public String name;
    public String hora;
    public String goalscored;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getGoalscored() {
        return goalscored;
    }
    public void setGoalscored(String goalscored) {
        this.goalscored = goalscored;
    }
    public MatchDetailsDto(String name, String hora, String goalscored) {
        this.name = name;
        this.hora = hora;
        this.goalscored = goalscored;
    }

    

}
