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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "status",nullable = false)
    private String status;
    @Column(name = "rent_date",nullable = false)
    private String rentDate;
    @Column(name = "return_date",nullable = false)
    private String returnDate;

    public void rentbook(RentRequestDto requestDto){
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
