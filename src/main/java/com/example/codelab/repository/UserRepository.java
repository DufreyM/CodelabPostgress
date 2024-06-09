package com.example.codelab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.codelab.model.User;
public interface UserRepository extends JpaRepository<User, Long> {
}

