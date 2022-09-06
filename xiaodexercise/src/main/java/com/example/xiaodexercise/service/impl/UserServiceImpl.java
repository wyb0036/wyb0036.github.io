package com.example.xiaodexercise.service.impl;

import com.example.xiaodexercise.domain.User;
import com.example.xiaodexercise.mapper.UserMapper;
import com.example.xiaodexercise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private static Map<String,User> sessionMap = new HashMap<>();
    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(String name, int age) {
        User user = userMapper.login(name, age);
        if (user == null){
            return null;
        }else {
            String token = UUID.randomUUID().toString();
            System.out.println(token);
            sessionMap.put(token,user);
            return token;
        }
    }
}
