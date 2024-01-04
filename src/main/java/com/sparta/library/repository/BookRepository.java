package com.sparta.library.repository;

import com.sparta.library.entity.Book;
import com.sparta.library.entity.Rent;
import com.sparta.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
//    List<User> findAllByOrderByModifiedAtDesc();
}
