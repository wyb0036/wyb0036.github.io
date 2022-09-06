package com.example.xiaodexercise.controller;

import com.example.xiaodexercise.domain.User;
import com.example.xiaodexercise.service.UserService;
import com.example.xiaodexercise.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("login")
    public JsonData login(@RequestBody User user){
        System.out.println("user="+user);

        String token = userService.login(user.getName(),user.getAge());

        return token!=null ? JsonData.buildSuccess(token):JsonData.buildSuccess("账号或密码错误");
    }
}
