package com.sparta.library.dto;

import com.sparta.library.entity.Book;
import com.sparta.library.entity.User;
import lombok.Getter;

@Getter
public class RentRequestDto {
    private User user;
    private Book book;
    private String status;
    private String rentDate;
    private String returnDate;
    public int getBookId() { return book.getId(); }
    public int getUserId() { return user.getId(); }
}
