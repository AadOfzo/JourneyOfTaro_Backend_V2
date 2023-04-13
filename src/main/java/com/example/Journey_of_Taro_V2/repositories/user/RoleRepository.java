package com.example.Journey_of_Taro_V2.repositories.user;

import com.example.Journey_of_Taro_V2.models.user.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, String> {
    Role findByName(String role_admin);
}
