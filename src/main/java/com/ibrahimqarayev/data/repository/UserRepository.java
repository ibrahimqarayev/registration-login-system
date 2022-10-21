package com.ibrahimqarayev.data.repository;

import com.ibrahimqarayev.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);

}
