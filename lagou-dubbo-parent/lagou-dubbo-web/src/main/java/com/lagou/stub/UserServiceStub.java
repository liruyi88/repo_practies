package com.lagou.stub;

import com.alibaba.druid.util.StringUtils;
import com.lagou.entity.User;
import com.lagou.service.UserService;
import org.jboss.netty.util.internal.StringUtil;

public class UserServiceStub implements UserService {
    //本地存根要以构造方式注入
    private UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public int register(User user) {
                //判断是否为空,是空的取反，返回0
        if (!StringUtils.isEmpty(user.getUsername())){
            userService.register(user);
        }
        return 0;
    }
}
