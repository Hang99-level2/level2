package com.sparta.library.dto;

import lombok.Getter;

@Getter
public class BookRequestDto {
    private int id;
    private String title;
    private String writer;
    private String language;
    private String publisher;
    private String regidate;

}