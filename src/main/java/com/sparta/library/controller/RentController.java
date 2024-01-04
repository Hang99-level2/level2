package com.sparta.library.controller;

import com.sparta.library.dto.RentRequestDto;
import com.sparta.library.dto.RentResponseDto;
import com.sparta.library.service.RentService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RentController {

    private final RentService rentService;
    public RentController(RentService rentService){
        this.rentService = rentService;
    }
    @PutMapping("/rent/{id}")
    public Long rentbook(@PathVariable Long id, @RequestBody RentRequestDto responseDto){
        return rentService.rentbook(id, responseDto);
    }

    @PutMapping("/return/{id}")
    public Long returnbook(@PathVariable Long id, @RequestBody RentRequestDto responseDto){
        return rentService.returnbook(id, responseDto);

    }

    @GetMapping("/rent/{id}")
    public List<RentResponseDto> getRentsById(@PathVariable int id){
        return rentService.getRentById(id);
    }
}
