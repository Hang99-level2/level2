package com.sparta.library.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "uId",nullable = false)
    private String uId;

    @Column(name = "password",nullable = false)
    private String password;
}