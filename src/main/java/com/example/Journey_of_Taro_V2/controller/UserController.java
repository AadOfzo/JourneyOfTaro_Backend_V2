package com.example.Journey_of_Taro_V2.controller;

import com.example.Journey_of_Taro_V2.model.User;
import com.example.Journey_of_Taro_V2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User userInput) {
        User newUser = userRepository.save(userInput);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping("/users/name")
    public ResponseEntity<Object> getUserName(){
        return new ResponseEntity<>(userRepository.findById(null), HttpStatus.OK);
    }
}
