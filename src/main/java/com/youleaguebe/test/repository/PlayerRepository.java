package com.youleaguebe.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.youleaguebe.test.models.PlayerInfo;
import com.youleaguebe.test.models.DTO.PlayerInfoDto;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface PlayerRepository extends JpaRepository<PlayerInfo, Integer>{

    @Query(value = "select p.name,p.phone,p.position, t.name as team, p.games,p.goal, p.assist from players p INNER JOIN teams t on t.id = p.team_id", nativeQuery = true)
    List<PlayerInfoDto> fetchAllPlayers();

}
