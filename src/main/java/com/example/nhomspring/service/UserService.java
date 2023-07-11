package com.example.nhomspring.service;

import com.example.nhomspring.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();
    public void addUser(User user);
    public void deleteUser(int id);
    public void update(User user);
    public User getUserById(int id);
   public  List<User> getUserByUserName(String userName);
}
