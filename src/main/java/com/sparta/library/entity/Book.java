package com.sparta.library.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity@Getter
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


}
