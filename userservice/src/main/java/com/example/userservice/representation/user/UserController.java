package com.example.userservice.representation.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping
    public ResponseEntity<Void> registerUser() {

        return ResponseEntity.ok(null);
    }

}
