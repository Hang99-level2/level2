package com.sparta.library.dto;

import lombok.Getter;

@Getter
public class RentRequestDto {
    private Long userId;
    private Long bookId;
    private String status;
    private String rentDate;
    private String returnDate;
}
