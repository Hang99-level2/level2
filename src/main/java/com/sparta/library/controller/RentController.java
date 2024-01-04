package com.sparta.library.controller;

import com.sparta.library.dto.RentRequestDto;
import com.sparta.library.dto.RentResponseDto;
import com.sparta.library.service.RentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RentController {
    private final RentService rentService;
    public RentController(RentService rentService){
        this.rentService = rentService;
    }
    @PostMapping("/rent")
    public RentResponseDto rentbook(@RequestBody RentRequestDto requestDto){
        return rentService.rentbook(requestDto);
    }

    @PutMapping("/return/{id}")
    public int returnbook(@PathVariable int id, @RequestBody RentRequestDto rentRequestDto){
        return rentService.returnbook(id, rentRequestDto);

    }
}
