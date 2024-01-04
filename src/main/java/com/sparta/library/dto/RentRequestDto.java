package com.sparta.library.dto;

import lombok.Getter;

@Getter
public class RentRequestDto {
    private Long user_id;
    private Long book_id;
    private String status;
    private String rent_date;
    private String return_date;
}
