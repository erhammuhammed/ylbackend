package com.youleaguebe.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youleaguebe.test.models.TeamInfo;
import com.youleaguebe.test.repository.TeamRepository;

@Service
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    public TeamInfo addTeamInfo(TeamInfo info){
        return teamRepository.save(info);
    }

    public List<TeamInfo> findAllTeams() {
        return teamRepository.findAll();
    }

}
