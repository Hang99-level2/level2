package com.sparta.library.service;


import com.sparta.library.dto.BookResponseDto;
import com.sparta.library.entity.Book;
import com.sparta.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private final BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public List<BookResponseDto> getBooks() {
        return bookRepository.findAllByOrderByRegidateAsc().stream().map(BookResponseDto::new).toList();
    }

    public BookResponseDto getBookById(int id) {
        Book book = bookRepository.findById(id).orElseThrow();
        return new BookResponseDto(book);
    }
}
