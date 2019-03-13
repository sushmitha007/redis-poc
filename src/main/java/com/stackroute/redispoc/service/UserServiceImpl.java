package com.stackroute.redispoc.service;

import com.stackroute.redispoc.domain.User;
import com.stackroute.redispoc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private User newUser;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserServiceImpl() {
    }

    @Override
    public User saveUser(User user) {
        newUser = userRepository.save(user);
        return newUser;
    }

    @Override
    public List<User> getAllUser() {
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(userList::add);
        return userList;
    }

    @Override
    public User getUserById(String userId) {
        newUser = userRepository.findById(userId).get();
        return newUser;

    }

    @Override
    public User updateUser(User user) {
        newUser = userRepository.save(user);
        return newUser;
    }

    @Override
    public boolean deleteUser(String userId) {
        boolean status = false;
        Optional optional = userRepository.findById(userId);
        if (optional.isPresent()) {
            userRepository.deleteById(userId);
            status = true;
        }
        else {
            return false;
        }
        return status;
    }
}
