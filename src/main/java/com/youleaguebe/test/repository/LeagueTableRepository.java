package com.youleaguebe.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.youleaguebe.test.models.LeagueTable;
import com.youleaguebe.test.models.DTO.TableDetailDTO;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface LeagueTableRepository extends JpaRepository<LeagueTable, Integer> {

    @Query(value = "SELECT t.name as teamName,CAST(ROW_NUMBER() OVER (ORDER BY  lb.points DESC,lb.gf-lb.ga DESC)  AS UNSIGNED) AS pos,lb.games,lb.wins,lb.draws,lb.loss,lb.points,lb.ga,lb.gf,CAST((lb.gf-lb.ga) AS SIGNED ) AS gd FROM league_table lb INNER JOIN teams t ON t.id = lb.team_id order by lb.points DESC", nativeQuery = true)
    List<TableDetailDTO> fetchFullTableDetails();

}
