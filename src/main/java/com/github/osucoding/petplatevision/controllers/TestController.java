package com.github.osucoding.petplatevision.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/test")
public class TestController {

    @GetMapping(value = "/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }
}
