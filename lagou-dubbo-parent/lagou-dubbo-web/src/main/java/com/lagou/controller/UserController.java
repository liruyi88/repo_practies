package com.lagou.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lagou.entity.User;
import com.lagou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/register")
    public ResponseResult register(User user){
        int row = userService.register(user);
        System.out.println(user);
        if (row > 0){
            return new ResponseResult(true,200,"注册成功!!!",row);
        }else {
            return new ResponseResult(true,400,"注册失败,输入有误!!",row);
        }
    }
}
