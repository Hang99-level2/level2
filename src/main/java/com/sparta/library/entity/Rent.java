package com.sparta.library.entity;

import com.sparta.library.dto.RentRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "userId")
    private int user;

    @Column(name = "bookId")
    private int book;

    @Column(name = "status",nullable = false)
    private String status;
    @Column(name = "rentDate",nullable = false)
    private String rentDate;
    @Column(name = "returnDate")
    private String returnDate;

    public Rent(RentRequestDto requestDto) {
        this.user = requestDto.getUser();
        this.book = requestDto.getBook();
        this.status = requestDto.getStatus();
        this.rentDate = requestDto.getRentDate();
    }

    public void RentBook(RentRequestDto requestDto){
        this.user = requestDto.getUser();
        this.book = requestDto.getBook();
        this.status = requestDto.getStatus();
        this.rentDate = requestDto.getRentDate();
        this.returnDate = requestDto.getReturnDate();
    }
    public void ReturnBook(RentRequestDto requestDto){
        this.status = requestDto.getStatus();
        this.returnDate = requestDto.getReturnDate();
    }
}
