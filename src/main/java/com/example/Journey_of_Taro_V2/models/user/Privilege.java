package com.example.Journey_of_Taro_V2.models.user;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long RoleId;

    private String RoleName;

    @ManyToMany(mappedBy = "privileges")
    private Collection<Role> roles;

    public Privilege(String name) {
    }

    public Privilege() {

    }
}
