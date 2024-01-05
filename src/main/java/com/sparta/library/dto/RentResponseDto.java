package com.sparta.library.dto;

import com.sparta.library.entity.Book;
import com.sparta.library.entity.Rent;
import com.sparta.library.entity.User;
import lombok.Getter;

@Getter
public class RentResponseDto {

    private String name;
    private String phoneNumber;
    private String title;
    private String writer;

    public RentResponseDto(User user, Book book) {
        this.name = user.getName();
        this.phoneNumber = user.getPhoneNumber();
        this.title = book.getTitle();
        this.writer = book.getWriter();
    }
}