package com.example.Journey_of_Taro_V2.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@IdClass(Authority.class)
@Table(name = "roles")
public class Role implements Serializable {

    @Id
    @Column(nullable = false)
    private String rolename;

    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;

}