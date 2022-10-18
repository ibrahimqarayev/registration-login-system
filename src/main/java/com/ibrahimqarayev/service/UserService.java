package com.ibrahimqarayev.service;

import com.ibrahimqarayev.dto.UserDto;
import com.ibrahimqarayev.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();


}
