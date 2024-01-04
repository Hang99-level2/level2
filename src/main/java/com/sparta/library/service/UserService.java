package com.sparta.library.service;

import com.sparta.library.dto.BookRequestDto;
import com.sparta.library.dto.BookResponseDto;
import com.sparta.library.dto.UserRequestDto;
import com.sparta.library.dto.UserResponseDto;
import com.sparta.library.entity.Book;
import com.sparta.library.entity.User;
import com.sparta.library.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserResponseDto createUser(UserRequestDto userrequestDto) {
        User user = new User(userrequestDto);

        User saveUser = userRepository.save(user);

        UserResponseDto userResponseDto = new UserResponseDto(saveUser);
        return userResponseDto;
    }


}
