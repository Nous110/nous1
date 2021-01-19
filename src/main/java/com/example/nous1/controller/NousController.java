package com.example.nous1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NousController {

    @RequestMapping("/login")
    public String login(){

        return "login 123444";
    }
}
