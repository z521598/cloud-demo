package com.baidu.microserivicesimpleprovider2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.microserivicesimpleprovider2.bean.User;
import com.baidu.microserivicesimpleprovider2.service.UserService;

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
