package com.sparta.library.dto;

import com.sparta.library.entity.Rent;
import lombok.Getter;

@Getter
public class RentResponseDto {

    private String name;
    private String phoneNumber;
    private String title;
    private String writer;

    public RentResponseDto(Rent rent) {
        this.name = rent.getUser().getName();
        this.phoneNumber = rent.getUser().getPhoneNumber();
        this.title = rent.getBook().getTitle();
        this.writer = rent.getBook().getWriter();
    }
}