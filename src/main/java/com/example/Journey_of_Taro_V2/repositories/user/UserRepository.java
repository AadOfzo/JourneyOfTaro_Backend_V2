package com.example.Journey_of_Taro_V2.repositories.user;

import com.example.Journey_of_Taro_V2.models.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String > {
    org.springframework.security.core.userdetails.User findByEmail(String email);

    org.springframework.security.core.userdetails.User findByUserName(String userName);
}
