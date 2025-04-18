package com.example.shopapptech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.shopapptech.models.*;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByPhoneNumber(String phoneNumber);
    Optional<User> findByPhoneNumber(String phoneNumber);
    //SELECT * FROM users WHERE phoneNumber=?
}

