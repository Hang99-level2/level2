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
    private int id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "status",nullable = false)
    private String status;
    @Column(name = "rentDate",nullable = false)
    private String rentDate;
    @Column(name = "returnDate",nullable = false)
    private String returnDate;

    public Rent(RentRequestDto requestDto){
        this.user = requestDto.getUser();
        this.book = requestDto.getBook();
        this.status = requestDto.getStatus();
        this.rentDate = requestDto.getRentDate();
        this.returnDate = requestDto.getReturnDate();
    }
    public void rentbook(RentRequestDto requestDto){
        this.user = requestDto.getUser();
        this.book = requestDto.getBook();
        this.status = requestDto.getStatus();
        this.rentDate = requestDto.getRentDate();
        this.returnDate = requestDto.getReturnDate();
    }
    public void returnbook(RentRequestDto requestDto){
        this.status = requestDto.getStatus();
        this.rentDate = requestDto.getRentDate();
        this.returnDate = requestDto.getReturnDate();
    }
}
