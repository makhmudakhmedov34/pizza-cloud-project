package com.cydeo.pizzacloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping({"/","/home"})
    public String getHomePage(){
        return "/home";
    }

}
