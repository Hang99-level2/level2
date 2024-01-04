package com.sparta.library.dto;

import com.sparta.library.entity.Book;
import com.sparta.library.entity.User;
import lombok.Getter;

@Getter
public class RentRequestDto {
    private String status;
    private String rent_date;
    private String return_date;
}
