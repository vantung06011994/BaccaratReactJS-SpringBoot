package com.bacarat.livebacaratbackend.service.impl;

import com.bacarat.livebacaratbackend.entity.Users;
import com.bacarat.livebacaratbackend.repository.UserRepository;
import com.bacarat.livebacaratbackend.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Boolean UserLogin(String username, String password) {
        try {
            Users user = userRepository.findByUsername(username);
            return user.getPassword().equals(password);
        } catch (Exception e) {
            return false;
        }
    }

}
