package com.sparta.library.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "u_id",nullable = false)
    private String u_id;

    @Column(name = "password",nullable = false)
    private String password;
}