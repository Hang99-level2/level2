package com.sparta.library.service;

import com.sparta.library.dto.RentRequestDto;
import com.sparta.library.dto.RentResponseDto;
import com.sparta.library.entity.Rent;
import com.sparta.library.repository.RentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class RentService {
    private final RentRepository rentRepository;

    public RentService(RentRepository rentRepository){
        this.rentRepository = rentRepository;
    }
    @Transactional
    public RentResponseDto rentbook(RentRequestDto requestDto){
        Rent rent = new Rent(requestDto);
        Rent saverent =rentRepository.save(rent);
        RentResponseDto rentResponseDto = new RentResponseDto(rent);
        return rentResponseDto;
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
}
