package com.alibaba.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.domain.User;
import com.alibaba.dubbo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User findUser() {
        User user = new User();
        user.setUserId(1L);
        user.setUserName("zhangsan");
        user.setEmail("123@qq.com");
        user.setAddress("xiamen");
        user.setPassword("root");
        user.setSex("man");
        return user;
    }
}
