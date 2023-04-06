package com.example.Journey_of_Taro_V2.dtos;

import com.example.Journey_of_Taro_V2.models.Authority;
import com.example.Journey_of_Taro_V2.models.Role;

import java.util.Collection;
import java.util.Set;

public class RoleDto {
    public String rolename;
    public Collection<Role> roles;
    public Set<Authority> authorities;

}
