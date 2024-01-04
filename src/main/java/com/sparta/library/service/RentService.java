package com.sparta.library.service;

import com.sparta.library.dto.RentRequestDto;
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
    public Integer rent_date(Integer id, RentRequestDto requestDto){
        Rent rent = findRent(id);
        return id;
    }

    private Rent findRent(Integer id){
        return rentRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("선택한 메모는 존재하지 않습니다")
        );
    }
}
