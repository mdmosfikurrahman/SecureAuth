package com.epde.secureauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "It's the HOME page!!";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "It's the DASHBOARD page!!";
    }
}
