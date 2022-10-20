package com.ibrahimqarayev.data.repository.repository;

import com.ibrahimqarayev.data.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
