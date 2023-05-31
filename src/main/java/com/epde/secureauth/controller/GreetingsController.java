package com.epde.secureauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from First API!");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> goodBye() {
        return ResponseEntity.ok("Good Bye from Second API!");
    }
}
