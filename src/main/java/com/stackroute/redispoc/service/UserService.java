package com.stackroute.redispoc.service;

import com.stackroute.redispoc.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    User getUserById(String userId);
    User updateUser(User user);
    boolean deleteUser(String userId);

}
