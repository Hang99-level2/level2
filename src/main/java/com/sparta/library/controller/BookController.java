package com.sparta.library.controller;

import com.sparta.library.dto.BookRequestDto;
import com.sparta.library.dto.BookResponseDto;
import com.sparta.library.dto.UserRequestDto;
import com.sparta.library.dto.UserResponseDto;
import com.sparta.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/api/books")
    public BookResponseDto createBook(@RequestBody BookRequestDto bookRequestDto) {
        return bookService.createBook(bookRequestDto);
    }

    @GetMapping("/api/books")
    public List<BookResponseDto> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/api/books/{id}")
    public BookResponseDto getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }
}
