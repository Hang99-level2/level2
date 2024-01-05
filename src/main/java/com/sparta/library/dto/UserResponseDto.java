package com.sparta.library.dto;

import com.sparta.library.entity.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private int id;
    private String name;
    private String gender;
    private String idNumber;
    private String phoneNumber;
    private String address;

    public UserResponseDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.gender = user.getGender();
        this.idNumber = user.getIdNumber();
        this.phoneNumber = user.getPhoneNumber();
        this.address = user.getAddress();
    }
}
