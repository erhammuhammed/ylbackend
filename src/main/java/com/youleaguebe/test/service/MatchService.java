package com.youleaguebe.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youleaguebe.test.models.MatchData;
import com.youleaguebe.test.models.DTO.FixtureDto;
import com.youleaguebe.test.repository.MatchDataRepository;
import com.youleaguebe.test.repository.MatchStatRepository;

@Service
public class MatchService {

    @Autowired
    MatchStatRepository matchStatRepository;

    @Autowired
    MatchDataRepository matchDataRepository;

    public MatchData saveNewMatch(MatchData data){
            matchDataRepository.updateMatchData(data.getHomeTeamId(), data.getAwayTeamId(), data.getHomeGoals(), data.getAwayGoals(), data.getTime(), data.isFinished());
            System.out.println("SP executed for match update");
            return data;
        }

    public List<FixtureDto> getAllFixturesSorted() {
        return matchDataRepository.getFixturesSorted();
    }
}
