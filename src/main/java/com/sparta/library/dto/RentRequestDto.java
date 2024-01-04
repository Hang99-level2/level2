package com.sparta.library.dto;

import com.sparta.library.entity.Book;
import com.sparta.library.entity.User;
import lombok.Getter;

@Getter
public class RentRequestDto {
    private int user;
    private int book;
    private String status;
    private String rentDate;
    private String returnDate;
}
