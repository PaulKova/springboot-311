package com.example.springbootdemo311.repository;

import com.example.springbootdemo311.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
