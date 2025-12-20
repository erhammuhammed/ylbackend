package com.youleaguebe.test.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youleaguebe.test.models.LeagueInfo;
import com.youleaguebe.test.models.UserInfo;

@RequestMapping("/user")
@CrossOrigin("*")
@RestController
public class UserController {

    @PostMapping("/login")
    public UserInfo saveNewLeague(@RequestBody UserInfo info) {
        if("yathin@yl.com".equals(info.getUsername()) && "yadu123".equals(info.getPassword()))
            return info;
        else
            return null;
    }

}
