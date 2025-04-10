package com.security.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecurityController {
    @GetMapping("/greet")
    public String greet()
    {
        return "Hello how are you ? im doing great";
    }

}
