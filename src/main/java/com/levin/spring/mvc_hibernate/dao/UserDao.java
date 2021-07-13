package com.levin.spring.mvc_hibernate.dao;

import com.levin.spring.mvc_hibernate.entity.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
