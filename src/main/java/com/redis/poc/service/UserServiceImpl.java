package com.redis.poc.service;


import com.redis.poc.model.User;
import com.redis.poc.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{


    @Autowired
    private UserDao userDao;

    @Override
    public boolean saveUser(User user) {

        return userDao.saveUser(user);

    }

    @Override
    public List<User> getAllUser() {
        return userDao.fetchAllUser();
    }


    @Override
    public User fetchUserById(Long id) {
        return userDao.fetchUserById(id);
    }

    @Override
    public boolean deleteUser(Long id) {
        return userDao.deleteUser(id);
    }

    @Override
    public boolean updateUser(Long id, User user) {
        return userDao.updateUser(id,user);
    }



}
