package com.sparta.library.controller;

import com.sparta.library.dto.BookResponseDto;
import com.sparta.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
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
