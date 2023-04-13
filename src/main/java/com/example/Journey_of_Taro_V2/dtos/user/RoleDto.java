package com.example.Journey_of_Taro_V2.dtos.user;

import com.example.Journey_of_Taro_V2.models.authentication.Authority;
import com.example.Journey_of_Taro_V2.models.user.Role;

import java.util.Collection;
import java.util.Set;

public class RoleDto {
    public String rolename;
    public Collection<Role> roles;
    public Set<Authority> authorities;

}
