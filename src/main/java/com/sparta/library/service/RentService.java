package com.sparta.library.service;

import com.sparta.library.dto.RentRequestDto;
import com.sparta.library.dto.RentResponseDto;
import com.sparta.library.entity.Rent;
import com.sparta.library.repository.RentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentService {
    private final RentRepository rentRepository;

    public RentService(RentRepository rentRepository){
        this.rentRepository = rentRepository;
    }
    @Transactional
    public Long rent_date(Long id, RentRequestDto requestDto){
        Rent rent = findRent(id);
        return id;
    }

    private Rent findRent(Long id){
        return rentRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("선택한 메모는 존재하지 않습니다")
        );
    }


    public List<RentResponseDto> getRentById(int id) {
        return rentRepository.findAllByUserIdOrderByRent_dateAsc(id).stream().map(RentResponseDto::new).toList();
    }
}
