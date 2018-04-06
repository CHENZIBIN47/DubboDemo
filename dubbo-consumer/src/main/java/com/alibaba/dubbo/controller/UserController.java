package com.alibaba.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.domain.User;
import com.alibaba.dubbo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Reference
    private UserService userService;

    @GetMapping("/user")
    public User user() {
        return userService.findUser();
    }
}
