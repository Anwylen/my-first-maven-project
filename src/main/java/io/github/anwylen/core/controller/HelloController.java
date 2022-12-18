package io.github.anwylen.core.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;

@Controller
public class HelloController {

    // Example without parameters
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World from Spring Boot");
    }

    // Example without path parameter
    @GetMapping("/salute")
    public ResponseEntity<String> hello(@PathParam("name") String name) {
        return ResponseEntity.ok("Hello "+name+" from Spring Boot");
    }

    // Example with path variable
    @GetMapping("/hi/{name}/{lastname}")
    public ResponseEntity<String> hi(@PathVariable String name,@PathVariable String lastname) {
        return ResponseEntity.ok("Hello "+name+" "+lastname);
    }
}

