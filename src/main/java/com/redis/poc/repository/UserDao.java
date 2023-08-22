package com.redis.poc.repository;

import com.redis.poc.model.User;

import java.util.List;

public interface UserDao {
    boolean saveUser(User user);

    List<User> fetchAllUser();
}
