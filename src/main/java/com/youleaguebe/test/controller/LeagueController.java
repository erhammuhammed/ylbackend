package com.youleaguebe.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youleaguebe.test.models.LeagueInfo;
import com.youleaguebe.test.models.LeagueTable;
import com.youleaguebe.test.models.DTO.TableDetailDTO;
import com.youleaguebe.test.service.LeagueService;


@RequestMapping("/leagues")
@CrossOrigin("*")
@RestController
public class LeagueController {

    @Autowired
    LeagueService leagueService;

    @PostMapping("/save")
    public LeagueInfo saveNewLeague(@RequestBody LeagueInfo info) {
        return leagueService.save(info);
    }

    @GetMapping("/getAll")
    public List<LeagueInfo> getAllLeagues() {
        return leagueService.getAllLeagues();
    }

    @GetMapping("/getTable")
    public List<TableDetailDTO> getLeagueTableInfo() {
        System.out.println("here");
        return leagueService.getLeagueTable();
    }

    @PostMapping("/updateTable")
    public LeagueTable updLeagueTable(@RequestBody LeagueTable data) {
        return leagueService.updateLeagueTableStatus(data);
    }

}
