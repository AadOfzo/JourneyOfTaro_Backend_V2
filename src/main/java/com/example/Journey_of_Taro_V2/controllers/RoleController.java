package com.example.Journey_of_Taro_V2.controllers;

import com.example.Journey_of_Taro_V2.dtos.RoleDto;
import com.example.Journey_of_Taro_V2.models.Role;
import com.example.Journey_of_Taro_V2.repositories.RoleRepository;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/roles")
public class RoleController {

    private final RoleRepository repos;

    public RoleController(RoleRepository repos) {
        this.repos = repos;
    }
    @PostMapping("/roles")
    public String createRole(@RequestBody RoleDto role) {
        Role newRole = new Role();
        newRole.setRolename(role.rolename);
        repos.save(newRole);

        return "Role created!";
    }
}
