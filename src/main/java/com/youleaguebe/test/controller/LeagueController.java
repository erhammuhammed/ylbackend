package com.youleaguebe.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youleaguebe.test.models.LeagueInfo;
import com.youleaguebe.test.service.LeagueService;

@RequestMapping("/leagues")
@RestController
public class LeagueController {

    @Autowired
    LeagueService leagueService;

    @PostMapping("/save")
    public LeagueInfo saveNewLeague(@RequestBody LeagueInfo info) {
        return leagueService.save(info);
    }

}
