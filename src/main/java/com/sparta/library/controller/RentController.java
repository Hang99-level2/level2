package com.sparta.library.controller;

import com.sparta.library.dto.RentRequestDto;
import com.sparta.library.dto.RentResponseDto;
import com.sparta.library.dto.renResponseDto;
import com.sparta.library.service.RentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RentController {

    private final RentService rentService;
    public RentController(RentService rentService){
        this.rentService = rentService;
    }
    @PostMapping("/rent")
    public renResponseDto RentBook(@RequestBody RentRequestDto requestDto){
        return rentService.RentBook(requestDto);
    }

    @PutMapping("/return/{id}")
    public int ReturnBook(@PathVariable int id, @RequestBody RentRequestDto rentRequestDto){
        return rentService.ReturnBook(id, rentRequestDto);
    }

    @GetMapping("/rent/{id}")
    public List<RentResponseDto> getRentsById(@PathVariable int id){
        return rentService.getRentById(id);
    }
}
