package com.example.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class ExampleApplication {


    @GetMapping("/anton/up")
    public ResponseEntity<Map<String, Object>> up() {
        Map<String, Object> response = new HashMap<>();
        response.put("anton", "hello");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}
