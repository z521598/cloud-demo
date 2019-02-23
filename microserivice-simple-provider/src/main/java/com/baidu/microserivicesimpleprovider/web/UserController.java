package com.baidu.microserivicesimpleprovider.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.microserivicesimpleprovider.bean.User;
import com.baidu.microserivicesimpleprovider.service.UserService;

@RestController
@RequestMapping("/rest/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return userService.get(id);
    }

}
