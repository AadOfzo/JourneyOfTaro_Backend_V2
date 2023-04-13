package com.example.Journey_of_Taro_V2.sevices.user;


import com.example.Journey_of_Taro_V2.dtos.user.UserDto;
import com.example.Journey_of_Taro_V2.models.authentication.Authority;
import com.example.Journey_of_Taro_V2.models.user.Privilege;
import com.example.Journey_of_Taro_V2.models.user.Role;
import com.example.Journey_of_Taro_V2.repositories.user.RoleRepository;
import com.example.Journey_of_Taro_V2.repositories.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service("userDetailService")
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

    // Repositotries kunnen niet initialiseren. (werkend gemaakt 12-4-2023)
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private final UserService userService;
    @Autowired
    private RoleRepository roleRepository;

    public CustomUserDetailsService(UserRepository userRepository, UserService userService, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.roleRepository = roleRepository;
    }
//
//    // Roles
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        User user = userRepository.findByUserName(userName);
//        UserDto userDto = userService.getUser(userName);
//
//        String password = userDto.getPassword();
//
//        Set<Authority> authorities = userDto.getAuthorities();
//        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//        for (Authority authority: authorities) {
//            grantedAuthorities.add(new SimpleGrantedAuthority(authority.getAuthority()));
//        }
//
//        if(user == null) {
//            return new org.springframework.security.core.userdetails.User
//                    (" ", " ", true, true, true, true, getAuthorities(Arrays.asList(roleRepository.findByName("ROLE_USER"))));
//        }
//
//        return new org.springframework.security.core.userdetails.User
//                (user.getUsername(), user.getPassword(), user.isEnabled(), true, true, true, getAuthorities(user.getRoles));
//    }
//    private Collection<? extends GrantedAuthority> getAuthorities(
//            Collection<Role> roles) {
//
//        return getGrantedAuthorities(getPrivileges(roles));
//    }
//
//    private List<String> getPrivileges(Collection<Role> roles) {
//
//        List<String> privileges = new ArrayList<>();
//        List<Privilege> collection = new ArrayList<>();
//        for (Role role : roles) {
//            privileges.add(role.getUsername());
//            collection.addAll(role.getAuthority());
//        }
//        for (Privilege item : collection) {
//            privileges.add(item.getName());
//        }
//        return privileges;
//    }
//
//        private List<GrantedAuthority> getGrantedAuthorities(List<String> privileges) {
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        for (String privilege : privileges) {
//            authorities.add(new SimpleGrantedAuthority(privilege));
//        }
//        return authorities;
//    }

//    Authority used in Roles

    @Override
    public UserDetails loadUserByUsername(String userName)  {
        UserDto userDto = userService.getUser(userName);

        String password = userDto.getPassword();

        Set<Authority> authorities = userDto.getAuthorities();
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (Authority authority: authorities) {
            grantedAuthorities.add(new SimpleGrantedAuthority(authority.getAuthority()));
        }

        return new org.springframework.security.core.userdetails.User(userName, password, grantedAuthorities);
    }

}