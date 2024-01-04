package com.sparta.library.dto;

import com.sparta.library.entity.Book;
import com.sparta.library.entity.Rent;
import com.sparta.library.entity.User;
import lombok.Getter;

@Getter
public class RentResponseDto {
    private User user;
    private Book book;
    private String status;
    private String rentDate;
    private String returnDate;
    public RentResponseDto(Rent rent){
        this.user= rent.getUser();
        this.book= rent.getBook();
        this.status= rent.getStatus();
        this.rentDate= rent.getRentDate();
        this.returnDate= rent.getReturnDate();
    }
}
