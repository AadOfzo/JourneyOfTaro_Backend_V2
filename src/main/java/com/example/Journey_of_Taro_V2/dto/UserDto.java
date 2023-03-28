package com.example.Journey_of_Taro_V2.dto;

import java.time.LocalDate;
import java.util.List;

public class UserDto {
    public Long id;
    public String username;
    public String firstname;
    public String lastname;
    public String artistname;

    public LocalDate dateofbirth;
    public String email;
    public String role;
    public List<String> authorities;
}
