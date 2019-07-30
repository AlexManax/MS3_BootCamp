package com.ms3.bootcamp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipsController {

    @RequestMapping("/ships")
    public String sayHi(){
        return "hi";
    }
}
