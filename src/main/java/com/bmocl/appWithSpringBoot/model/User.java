package com.bmocl.appWithSpringBoot.model;

import jakarta.persistence.*;
@Entity
@Table(name = "users_spring")
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

    public User() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
               "id=" + id +
               ", lastName='" + lastName + '\'' +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", email='" + email + '\'' +
               '}';
    }
}

