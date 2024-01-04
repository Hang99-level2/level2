package com.sparta.library.controller;

import com.sparta.library.dto.*;
import com.sparta.library.service.BookService;
import com.sparta.library.service.RentService;
import com.sparta.library.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RentController {
    private final RentService rentService;
    private final BookService bookService;
    private final UserService userService;

    public RentController(RentService rentService, BookService bookService, UserService userService){
        this.rentService = rentService;
        this.bookService = bookService;
        this.userService = userService;
    }

    @PostMapping("/books")
    public BookResponseDto registerBook(@RequestBody BookRequestDto bookRequestDto) {
        return bookService.createBook(bookRequestDto);
    }

    @PostMapping("/users")
    public UserResponseDto registerUser(@RequestBody UserRequestDto userRequestDto) {
        return userService.createUser(userRequestDto);
    }



    @PutMapping("/rent/{id}")
    public Long rentbook(@PathVariable Long id, @RequestBody RentRequestDto responseDto) {
//        return rentService.rentbook(id, responseDto);
        return null;
    }

    @PutMapping("/return/{id}")
    public Long returnbook(@PathVariable Long id, @RequestBody RentRequestDto responseDto){
//        return rentService.returnbook(id, responseDto);
        return null;
    }
}
