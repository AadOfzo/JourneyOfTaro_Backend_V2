package com.example.Journey_of_Taro_V2.repositories;

import com.example.Journey_of_Taro_V2.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String > {
}
