package com.youleaguebe.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youleaguebe.test.models.PlayerInfo;
import com.youleaguebe.test.models.DTO.PlayerInfoDto;
import com.youleaguebe.test.repository.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public List<PlayerInfoDto> getAllPlayers(){
        return playerRepository.fetchAllPlayers();
    }

    public PlayerInfo addPlayer(PlayerInfo data) {
        return playerRepository.save(data);
    }

}
