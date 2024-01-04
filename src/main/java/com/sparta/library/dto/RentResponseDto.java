package com.sparta.library.dto;

import com.sparta.library.entity.Rent;
import lombok.Getter;

@Getter
public class RentResponseDto {
    private int id;
    private int username;
    private int bookId;

    private String status;
    private String rentDate;
    private String returnDate;

    public RentResponseDto(Rent rent) {
        this.id = rent.getId();
        this.username = rent.getUser().getId();
        this.bookId = rent.getBook().getId();
        this.status = rent.getStatus();
        this.rentDate = rent.getRentDate();
        this.returnDate = rent.getReturnDate();
    }
}
