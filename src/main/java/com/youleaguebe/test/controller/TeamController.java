package com.youleaguebe.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youleaguebe.test.models.TeamInfo;
import com.youleaguebe.test.service.TeamService;

@RequestMapping("/teams")
@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class TeamController {

    @Autowired
    TeamService teamService;

    @PostMapping("/save")
    public TeamInfo saveNewTeam(@RequestBody TeamInfo info) {
        return teamService.addTeamInfo(info);
    }

    @GetMapping("/getAll")
    public List<TeamInfo> getAllTeams() {
        return teamService.findAllTeams();
    }

}
