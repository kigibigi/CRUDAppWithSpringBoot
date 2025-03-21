package com.bmocl.appWithSpringBoot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users_spring")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "last_name")
    private String lastName;
    private String name;
    private int age;
    private String email;

    public User(String lastName, String name, int age, String email) {
        this.lastName = lastName;
        this.name = name;
        this.age = age;
        this.email = email;
    }

}

