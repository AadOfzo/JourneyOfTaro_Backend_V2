package com.example.Journey_of_Taro_V2.repository;

import com.example.Journey_of_Taro_V2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {
}
