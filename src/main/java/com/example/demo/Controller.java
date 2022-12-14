package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private SingletonComponent singletonComponent;

    @GetMapping
    public ResponseEntity<Message> get() {
        return ResponseEntity.ok(singletonComponent.getMessage());
    }

    @PostMapping
    public ResponseEntity<Message> post(@RequestBody String message) {
        singletonComponent.setMessage(message);
        return ResponseEntity.ok(singletonComponent.getMessage());
    }
}
