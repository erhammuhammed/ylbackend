package com.youleaguebe.test.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.youleaguebe.test.models.MatchData;
import com.youleaguebe.test.models.MatchDetailsDto;
import com.youleaguebe.test.models.DTO.FixtureDto;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface MatchDataRepository extends JpaRepository<MatchData, Integer>{
    @Procedure
    public void updateMatchData(@Param("home") int home,@Param("away") int away,@Param("homeGoals") int homeGoals,@Param("awayGoals") int awayGoals,@Param("time") Date time, @Param("finished") Boolean finished);

    @Query(value="SELECT m.id as matchId,m.home_goals, m.away_goals,m.time, m.finished,th.name as homeTeam, ta.name as awayTeam FROM matches m INNER JOIN teams th ON th.id = m.home INNER JOIN teams ta ON ta.id = m.away ORDER BY time desc", nativeQuery = true)
    public List<FixtureDto> getFixturesSorted();

    @Procedure
    public void updateMatchStatsAndTeam(@Param("matchId") int matchId, @Param("playerId") int playerId, @Param("goal") boolean goal, @Param("assist") boolean assist, @Param("cleansheet") boolean cleansheet);
    
    //@Query(value = "EXEC getMatchDetails :matchId", nativeQuery = true)
    //@Query(value = "select CAST (p.name AS VARCHAR) AS name, CAST((CASE p.team_id WHEN m.home THEN 'h' WHEN m.away THEN 'a' END) AS VARCHAR) AS hora, CAST(COUNT(*) AS INT)  AS goalscored from [dbo].[matches] m INNER JOIN [dbo].[match_stats] ms on m.id = ms.match_id INNER JOIN [dbo].[players] p on p.id=ms.player_id WHERE m.id= :matchId GROUP BY p.name, p.team_id, m.home, m.away", nativeQuery=true)
    @Procedure(name = "MatchData.getMatchDetails")
    @Transactional
    public List<MatchDetailsDto> getMatchDetails(@Param("matchId") int matchId);
}
