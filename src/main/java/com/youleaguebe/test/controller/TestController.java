package com.youleaguebe.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @PostMapping("/hello")
    public String helloworld(@RequestBody String data){
        return "Hello"+data;
    }

    @GetMapping("/hi")
    public String helloworldGet(){
        return "Hello";
    }

}
