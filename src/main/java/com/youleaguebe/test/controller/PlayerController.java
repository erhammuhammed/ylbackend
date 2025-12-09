package com.youleaguebe.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youleaguebe.test.models.PlayerInfo;
import com.youleaguebe.test.models.DTO.PlayerInfoDto;
import com.youleaguebe.test.service.PlayerService;

@RestController
@RequestMapping("/player")
@CrossOrigin("*")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping("/add")
    public PlayerInfo addNewPlayer(@RequestBody PlayerInfo data) {
        return playerService.addPlayer(data);
    }

    @GetMapping("/getAll")
    public List<PlayerInfoDto> getAllPlayerDetails() {
        return playerService.getAllPlayers();
    }

}
