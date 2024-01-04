package com.sparta.library.dto;

import lombok.Getter;

@Getter
public class RentRequestDto {
    private int user_id;
    private int book_id;
    private String status;
    private String rent_date;
    private String return_date;
}
