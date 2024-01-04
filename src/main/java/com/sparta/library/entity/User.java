package com.sparta.library.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "gender",nullable = false)
    private String gender;

    @Column(name = "idNumber",nullable = false)
    private String idNumber;

    @Column(name = "phoneNumber",nullable = false)
    private String phoneNumber;

    @Column(name = "address",nullable = false)
    private String address;

}
