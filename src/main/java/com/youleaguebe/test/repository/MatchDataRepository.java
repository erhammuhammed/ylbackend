package com.youleaguebe.test.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.youleaguebe.test.models.MatchData;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface MatchDataRepository extends JpaRepository<MatchData, Integer>{
    @Procedure
    public void updateMatchData(@Param("home") int home,@Param("away") int away,@Param("homeGoals") int homeGoals,@Param("awayGoals") int awayGoals,@Param("time") Date time, @Param("finished") Boolean finished);
}
