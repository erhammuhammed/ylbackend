package com.youleaguebe.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youleaguebe.test.models.LeagueInfo;
import com.youleaguebe.test.repository.LeagueRepository;

@Service
public class LeagueService {

    @Autowired
    private LeagueRepository leagueRepository;

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

}
