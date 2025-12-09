package com.youleaguebe.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youleaguebe.test.models.MatchData;
import com.youleaguebe.test.models.DTO.FixtureDto;
import com.youleaguebe.test.service.MatchService;

@RestController
@CrossOrigin("*")
@RequestMapping("/match")
public class MatchController {

    @Autowired
    MatchService matchService;

    @PostMapping("/add")
    public MatchData addNewMatch(@RequestBody MatchData data) {
        return matchService.saveNewMatch(data);
    }

    @GetMapping("/fixture")
    public List<FixtureDto> getAllFixturesSortedDesc() {
        return matchService.getAllFixturesSorted();
    }

}
