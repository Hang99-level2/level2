package com.sparta.library.repository;

import com.sparta.library.entity.Rent;
import com.sparta.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

}
