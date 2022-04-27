package com.example.userservice.representation.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserController {

    @PostMapping("/hello")
    public String hello(HttpServletRequest httpServletRequest) throws InterruptedException {
        Enumeration<String> headers = httpServletRequest.getHeaders("");

        log.info("zzz = {}", headers.hasMoreElements());

        while (headers.hasMoreElements()) {
            System.out.println(headers.nextElement());
        }

        Thread.sleep(3000);
        return "hello";
    }

    @PostMapping
    public ResponseEntity<Void> registerUser() {

        return ResponseEntity.ok(null);
    }

}
