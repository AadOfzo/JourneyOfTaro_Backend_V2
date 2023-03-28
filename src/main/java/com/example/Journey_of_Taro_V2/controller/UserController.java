package com.example.Journey_of_Taro_V2.controller;
import com.example.Journey_of_Taro_V2.dto.UserDto;
import com.example.Journey_of_Taro_V2.sevice.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<Long> createUser(@Validated @RequestBody UserDto userDto) {
        Long userId = userService.createUser(userDto);
        return new ResponseEntity<>(userId, HttpStatus.CREATED);
    }

//    @GetMapping("/users/name")
//    public ResponseEntity<Object> getUserName(){
//        return new ResponseEntity<>(newUser.findBy(), HttpStatus.OK);
//    }

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


}
