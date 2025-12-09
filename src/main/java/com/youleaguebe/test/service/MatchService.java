package com.youleaguebe.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youleaguebe.test.models.MatchData;
import com.youleaguebe.test.repository.MatchDataRepository;
import com.youleaguebe.test.repository.MatchStatRepository;

@Service
public class MatchService {

    @Autowired
    MatchStatRepository matchStatRepository;

    @Autowired
    MatchDataRepository matchDataRepository;

    public MatchData saveNewMatch(MatchData data){
        return matchDataRepository.save(data);
    }

}
