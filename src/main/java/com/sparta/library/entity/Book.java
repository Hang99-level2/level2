package com.sparta.library.entity;

import com.sparta.library.dto.BookRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity@Getter
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name="writer",nullable = false,length = 20)
    private String writer;

    @Column(name="language", nullable = false,length = 20)
    private String language;

    @Column(name = "publisher", nullable = false,length = 20)
    private String publisher;

    @Column(name = "regidate", nullable = false,length = 20)
    private String regidate;

    public Book(BookRequestDto bookRequestDto) {
        this.id = bookRequestDto.getId();
        this.title = bookRequestDto.getTitle();
        this.writer = bookRequestDto.getWriter();
        this.language = bookRequestDto.getLanguage();
        this.publisher = bookRequestDto.getPublisher();
        this.regidate = bookRequestDto.getRegidate();
    }

    public Book(int id, String title, String writer, String language, String publisher, String regidate) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.language = language;
        this.publisher = publisher;
        this.regidate = regidate;
    }


}

