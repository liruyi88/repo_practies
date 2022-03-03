package com.lagou.stu;

import com.lagou.entity.User;
import com.lagou.service.UserService;

public class UserServiceStu implements UserService {
    private UserService userService;

    public UserServiceStu(UserService userService) {
        this.userService = userService;
    }

    @Override
    public int register(User user) {
        System.out.println("本地存根数据");
        if (user != null){
            return userService.register(user);
        }
        return 0;
    }
}
