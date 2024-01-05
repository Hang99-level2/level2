package com.sparta.library.service;

import com.sparta.library.dto.RentRequestDto;
import com.sparta.library.dto.RentResponseDto;
import com.sparta.library.dto.renResponseDto;
import com.sparta.library.entity.Book;
import com.sparta.library.entity.Rent;
import com.sparta.library.entity.User;
import com.sparta.library.repository.BookRepository;
import com.sparta.library.repository.RentRepository;
import com.sparta.library.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentService {
    private final RentRepository rentRepository;
    private final BookRepository bookRepository;
    private final UserRepository userRepository;

    public RentService(RentRepository rentRepository, BookRepository bookRepository, UserRepository userRepository){
        this.rentRepository = rentRepository;
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }
    @Transactional
    public renResponseDto rentbook(RentRequestDto requestDto){
        Rent rent = new Rent(requestDto);
        Rent saverent =rentRepository.save(rent);
        return new renResponseDto(saverent);
    }
    @Transactional
    public int returnbook(int id, RentRequestDto requestDto){
        Rent rent = findRent(id);
        rent.returnbook(requestDto);
        return id;
    }


    private Rent findRent(int id){
        return rentRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("선택한 메모는 존재하지 않습니다")
        );
    }

    public List<RentResponseDto> getRentById(int id) {
        List<Rent> rents = rentRepository.findAllByUserAndStatusOrderByRentDateAsc(id,"out");
        List<RentResponseDto> rentResponseDtoList = new ArrayList<>();
        for(Rent rent : rents){
            User user = userRepository.findById(rent.getUser()).orElseThrow();
            Book book = bookRepository.findById(rent.getBook()).orElseThrow();
            RentResponseDto rentResponseDto = new RentResponseDto(user,book);
            rentResponseDtoList.add(rentResponseDto);
        }
        return rentResponseDtoList;
    }
}
