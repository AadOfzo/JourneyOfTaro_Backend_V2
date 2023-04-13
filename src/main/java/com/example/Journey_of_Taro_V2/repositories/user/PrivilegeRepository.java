package com.example.Journey_of_Taro_V2.repositories.user;

import com.example.Journey_of_Taro_V2.models.user.Privilege;
import org.springframework.data.repository.CrudRepository;

public interface PrivilegeRepository extends CrudRepository<Privilege, String> {
    Privilege findByName(String name);
}
