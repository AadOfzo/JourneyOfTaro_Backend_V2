package com.example.Journey_of_Taro_V2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    //AUTHENTICATION
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        InMemoryUserDetailsManager man = new InMemoryUserDetailsManager();

        UserDetails u1 = User
                .withUsername("Adrien")
                .password(encoder.encode("paswoord"))
                .roles("USER", "ADMIN")
                .build();
        man.createUser(u1);

        UserDetails u2 = User
                .withUsername("Henk")
                .password(encoder.encode("Appel"))
                .roles("USER")
                .build();
        man.createUser(u2);

        return man;
    }

    //AUTHORIZATION
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeHttpRequests()
                // authorizeRequests = authorizeHttpRequests -- antMachers = requestMatchers
                .requestMatchers(HttpMethod.GET,"/users").hasRole("USER")
                .requestMatchers(HttpMethod.POST,"/users/secret").hasRole("ADMIN")
                .requestMatchers("/**").permitAll()
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        return http.build();
    }
}
