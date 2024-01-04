package com.sparta.library.dto;

import com.sparta.library.entity.Rent;
import lombok.Getter;

@Getter
public class RentResponseDto {
    private int id;
    private int user_id;
    private int book_id;

    private String status;
    private String rent_date;
    private String return_date;

    public RentResponseDto(Rent rent) {
        this.id = rent.getId();
        this.user_id = rent.getUser().getId();
        this.book_id = rent.getBook().getId();
        this.status = rent.getStatus();
        this.rent_date = rent.getRent_date();
        this.return_date = rent.getReturn_date();
    }
}
