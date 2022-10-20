package com.ibrahimqarayev.bussiness.services.impl;

import com.ibrahimqarayev.bussiness.dto.UserDto;
import com.ibrahimqarayev.data.entity.User;
import com.ibrahimqarayev.data.repository.repository.RoleRepository;
import com.ibrahimqarayev.data.repository.repository.UserRepository;
import com.ibrahimqarayev.bussiness.services.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void saveUser(UserDto userDto) {

    }

    @Override
    public User findUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return user;
    }


    @Override
    public List<UserDto> findAllUsers() {
        return null;
    }
}
