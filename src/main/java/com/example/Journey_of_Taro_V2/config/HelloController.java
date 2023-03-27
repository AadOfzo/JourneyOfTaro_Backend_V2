package com.example.Journey_of_Taro_V2.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth.getPrincipal() instanceof UserDetails) {
            return "Hello " + ((UserDetails) auth.getPrincipal()).getUsername();
        }
        return "Hello Stranger!";
    }

    @GetMapping("/secret")
    public String saySecret() {
        return "this is secret...";
    }
}
