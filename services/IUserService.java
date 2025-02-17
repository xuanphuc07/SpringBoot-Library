package com.example.shopapptech.services;

import com.example.shopapptech.dtos.UserDTO;
import com.example.shopapptech.exceptions.DataNotFoundException;
import com.example.shopapptech.models.User;

public interface IUserService {
    User createUser(UserDTO userDTO) throws Exception;
    String login(String phoneNumber, String password) throws Exception;
}
