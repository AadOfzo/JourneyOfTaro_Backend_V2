package com.example.Journey_of_Taro_V2.controller;

import com.example.Journey_of_Taro_V2.model.User;
import com.example.Journey_of_Taro_V2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users/name")
    public ResponseEntity<Object> getUserName(){
        return new ResponseEntity<>(userRepository.findById(userName), HttpStatus.OK);
    }

    @GetMapping("/users")
    public String sayHello() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth.getPrincipal() instanceof UserDetails) {
            return "Hello " + ((UserDetails) auth.getPrincipal()).getUsername();
        }
        return "Hello Stranger!";
    }

    @GetMapping("/users/secret")
    public String saySecret() {
        return "this is secret...";
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User userInput) {
        User newUser = userRepository.save(userInput);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

}
