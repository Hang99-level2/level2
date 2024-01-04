package com.sparta.library.repository;

import com.sparta.library.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentRepository extends JpaRepository<Rent, Long> {
    List<Rent> findAllByUserIdOrderByRent_dateAsc();
}
