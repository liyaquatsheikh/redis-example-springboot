package com.redis.poc.service;


import com.redis.poc.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    boolean saveUser(User user);

    List<User> getAllUser();
}
