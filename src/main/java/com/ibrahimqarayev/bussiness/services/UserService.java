package com.ibrahimqarayev.bussiness.services;

import com.ibrahimqarayev.bussiness.dto.UserDto;
import com.ibrahimqarayev.data.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();


}
