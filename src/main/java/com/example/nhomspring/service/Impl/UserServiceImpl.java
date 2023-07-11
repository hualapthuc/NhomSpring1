package com.example.nhomspring.service.Impl;

import com.example.nhomspring.model.User;
import com.example.nhomspring.repository.PostRepository;
import com.example.nhomspring.repository.UserRepository;
import com.example.nhomspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void update(User user) {
         userRepository.save(user);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("user not found"));
    }

    @Override
    public List<User> getUserByUserName(String userName) {
        return userRepository.findByName(userName);
    }


}