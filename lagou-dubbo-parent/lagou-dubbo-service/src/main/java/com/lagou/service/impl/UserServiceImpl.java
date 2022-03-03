package com.lagou.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lagou.dao.UserMapper;
import com.lagou.entity.User;
import com.lagou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int register(User user) {
        return userMapper.register(user);
    }
}
