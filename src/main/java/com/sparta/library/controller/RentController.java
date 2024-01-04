package com.sparta.library.controller;

import com.sparta.library.dto.RentRequestDto;
import com.sparta.library.service.RentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RentController {
    private final RentService rentService;
    public RentController(RentService rentService){
        this.rentService = rentService;
    }
    @PutMapping("/rent/{id}")
    public Long rentbook(@PathVariable Long id, @RequestBody RentRequestDto responseDto){
//        return rentService.rentbook(id, responseDto);
        return null;
    }

    @PutMapping("/return/{id}")
    public Long returnbook(@PathVariable Long id, @RequestBody RentRequestDto responseDto){
//        return rentService.returnbook(id, responseDto);
        return null;
    }
}
