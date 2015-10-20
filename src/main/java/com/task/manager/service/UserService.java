package com.task.manager.service;

import com.task.manager.model.User;
import com.task.manager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bharatghimire on 21/10/15.
 */
@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public User user;

    public User add(User user) {
        return userRepository.save(user);
    }

    public List<User> listAll() {
        return (List<User>) userRepository.findAll();
    }

    public User getUserById(Long id) {
        return (User) userRepository.findOne(id);
    }

    public List<User> getUserByName(String name) {
        return (List<User>) userRepository.findAllByName(name);
    }

}
