package com.sparta.library.repository;

import com.sparta.library.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentRepository extends JpaRepository<Rent, Long> {
    List<Rent> findAllByOrderByModifiedAtDesc();
}
