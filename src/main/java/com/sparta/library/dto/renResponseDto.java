package com.sparta.library.dto;

import com.sparta.library.entity.Book;
import com.sparta.library.entity.Rent;
import com.sparta.library.entity.User;
import lombok.Getter;

@Getter
public class renResponseDto {


    private String status;
    private String rentDate;
    private String returnDate;

    public renResponseDto(Rent rent) {
        this.status = rent.getStatus();
        this.rentDate = rent.getRentDate();
        this.returnDate = rent.getReturnDate();
    }
}
