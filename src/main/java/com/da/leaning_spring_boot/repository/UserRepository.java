package com.da.leaning_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.da.leaning_spring_boot.entity.User;
@Repository
public interface UserRepository extends  JpaRepository<User, String> {
    boolean existsByUsername(String username);
}