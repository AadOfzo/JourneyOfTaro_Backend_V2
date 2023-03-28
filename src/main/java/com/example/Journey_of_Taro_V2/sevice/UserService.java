package com.example.Journey_of_Taro_V2.sevice;

import com.example.Journey_of_Taro_V2.dto.UserDto;
import com.example.Journey_of_Taro_V2.model.User;
import com.example.Journey_of_Taro_V2.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public Long createUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.id);
        user.setUserName(userDto.username);
        user.setFirstName(userDto.firstname);
        user.setLastName(userDto.lastname);
        user.setArtistName(userDto.artistname);
        user.setDateOfBirth(String.valueOf(userDto.dateofbirth));
        user.setEmail(userDto.email);
        user.setRole(userDto.role);

        User savedUser = this.userRepository.save(user);

        return savedUser.getId();
    }
}
