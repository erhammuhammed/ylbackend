package com.youleaguebe.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youleaguebe.test.models.LeagueInfo;
import com.youleaguebe.test.models.LeagueTable;
import com.youleaguebe.test.models.DTO.TableDetailDTO;
import com.youleaguebe.test.repository.LeagueRepository;
import com.youleaguebe.test.repository.LeagueTableRepository;

import jakarta.persistence.Tuple;

@Service
public class LeagueService {

    @Autowired
    private LeagueRepository leagueRepository;

    @Autowired
    private LeagueTableRepository leagueTableRepository;

    public LeagueInfo save(LeagueInfo info) {
        info = leagueRepository.save(info);
        return info;
    }

    public List<LeagueInfo> getAllLeagues() {
        return leagueRepository.findAll();
    }

    public List<LeagueInfo> findLeagueByName(String key) {
        return leagueRepository.findByNameContaining(key);
    }

    public List<TableDetailDTO> getLeagueTable(){
        return leagueTableRepository.fetchFullTableDetails();
    }

    public LeagueTable updateLeagueTableStatus(LeagueTable data) {
        System.out.println("Table data:"+data.toString());
        return leagueTableRepository.save(data);
    }
}
