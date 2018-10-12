package com.example.springbootquartz.dao;

import com.example.springbootquartz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findByAccountAndPassword(String account, String password);

    User findByAccount(String account);
}
