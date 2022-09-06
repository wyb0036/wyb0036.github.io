package com.example.xiaodexercise.mapper;

import com.example.xiaodexercise.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class UserMapper {
    public static Map<String, User> userMap = new HashMap<>();

    static {
        userMap.put("张楚岚",new User("张楚岚",18,"男"));
        userMap.put("白小纯",new User("白小纯",18,"男"));
        userMap.put("唐三",new User("唐三",18,"男"));
        userMap.put("萧炎",new User("萧炎",18,"男"));
    }

    public User login(String name,int age){
        User user = userMap.get(name);
        if (user == null){
            return null;
        }
        if (user.getAge() == age){
            return user;
        }
        return null;
    }
}
