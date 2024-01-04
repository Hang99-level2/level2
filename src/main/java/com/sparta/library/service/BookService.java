package com.sparta.library.service;

import com.sparta.library.dto.BookRequestDto;
import com.sparta.library.dto.BookResponseDto;
import com.sparta.library.dto.UserRequestDto;
import com.sparta.library.entity.Book;
import com.sparta.library.entity.User;
import com.sparta.library.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    public BookResponseDto createBook(BookRequestDto bookrequestDto) {
        Book book = new Book(bookrequestDto);

        Book saveBook = bookRepository.save(book);

        BookResponseDto bookResponseDto = new BookResponseDto(saveBook);
        return bookResponseDto;
    }

    public List<BookResponseDto> getBooks() {
        return bookRepository.findAllByOrderByRegidateAsc().stream().map(BookResponseDto::new).toList();
    }

    public BookResponseDto getBookById(int id) {
        Book book = bookRepository.findById(id).orElseThrow();
        return new BookResponseDto(book);
    }
}
