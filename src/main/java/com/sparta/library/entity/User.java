package com.sparta.library.entity;

import com.sparta.library.dto.UserRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity @Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "idNumber", nullable = false)
    private String idNumber;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @Column(name = "address", nullable = false)
    private String address;

    public User(UserRequestDto userRequestDto) {

        this.name = userRequestDto.getName();
        this.gender = userRequestDto.getGender();
        this.idNumber = userRequestDto.getIdNumber();
        this.phoneNumber = userRequestDto.getPhoneNumber();
        this.address = userRequestDto.getAddress();

    }

    public User(int id, String name, String gender, String idNumber, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

}