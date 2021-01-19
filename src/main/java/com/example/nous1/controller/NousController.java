package com.example.nous1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NousController {

    @RequestMapping("/login")
    public String login(){

        return "login ";
    }
    @RequestMapping("/login1")
    public String login1(){

        return "login ";
    }

    public static String getLogin(String id ,String password){
        System.out.println("id23123123 123123= " + id);
        return  "ok456";
    }
    /**
     * @Description:
     * @see bug/request id：
     * @see action :
     * @see param : add2.0
     * @author: 213123
     * @date: 0:15 2021/1/20
     * @return :
     */
    public static void main(String[] args) {
        System.out.println("args 11= " + args);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
