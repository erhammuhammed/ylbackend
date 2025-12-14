package com.youleaguebe.test.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;

@Entity
@Table(name = "matches")
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
        name = "MatchData.getMatchDetails",
        procedureName = "getMatchDetails",
        resultSetMappings = "MatchDetailsDto",
        parameters = {@StoredProcedureParameter(mode = ParameterMode.IN, name = "matchId", type = Integer.class)}
    )
})
@SqlResultSetMapping(
    name = "MatchDetailsDto",
    classes = @ConstructorResult(
        targetClass = MatchDetailsDto.class,
        columns = {
            @ColumnResult(name = "name", type = String.class),
            @ColumnResult(name = "hora", type = String.class),
            @ColumnResult(name = "goalscored", type = String.class)
        }
    )
)
public class MatchData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "home")
    public int homeTeamId;

    @Column(name = "away")
    public int awayTeamId;

    @Column(name = "time")
    public Date time;

    @Column(name = "homeGoals")
    public int homeGoals;

    @Column(name = "awayGoals")
    public int awayGoals;

    @Column(name = "finished")
    public boolean finished;

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(int homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public int getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(int awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }

    


}
