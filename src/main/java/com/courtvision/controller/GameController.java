package com.courtvision.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @GetMapping("/hello")
    public String hello() {
        return "🏀 Welcome to CourtVision API";
    }
}