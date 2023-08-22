package com.redis.poc.controller;

import com.redis.poc.model.User;
import com.redis.poc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> saveUser(@RequestBody User user)
    {

        boolean result = userService.saveUser(user);

        if(result)
        {
        return ResponseEntity.ok("User Created Successfully");
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build()    ;
        }
    }

    @GetMapping("user")
    public ResponseEntity<List<User>> fetchAllUser() {

        List<User> userList;

        userList = userService.getAllUser();

        return ResponseEntity.ok(userList);

    }
}
