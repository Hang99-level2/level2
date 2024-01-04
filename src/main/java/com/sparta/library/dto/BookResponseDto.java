package com.sparta.library.dto;

import com.sparta.library.entity.Book;
import lombok.Getter;

@Getter
public class BookResponseDto {

    private int id;
    private String title;
    private String writer;
    private String language;
    private String publisher;
    private String regidate;


    public BookResponseDto(Book book) {
        this.id = book.getId();
        this.title = book.getTitle();
        this.writer = book.getWriter();
        this.language = book.getLanguage();
        this.publisher = book.getPublisher();
        this.regidate = book.getRegidate();

    }
}
