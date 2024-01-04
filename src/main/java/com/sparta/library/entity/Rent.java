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
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "status",nullable = false)
    private String status;
    @Column(name = "rent_date",nullable = false)
    private String rent_date;
    @Column(name = "return_date",nullable = false)
    private String return_date;

    public void rentbook(RentRequestDto requestDto){
        this.status = requestDto.getStatus();
        this.rent_date = requestDto.getRent_date();
        this.return_date = requestDto.getReturn_date();
    }
    public void returnbook(RentRequestDto requestDto){
        this.status = requestDto.getStatus();
        this.rent_date = requestDto.getRent_date();
        this.return_date = requestDto.getReturn_date();
    }
}
