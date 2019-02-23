package com.baidu.microserivicesimpleprovider2.service;

import org.springframework.stereotype.Service;

import com.baidu.microserivicesimpleprovider2.bean.User;

@Service
public class UserService implements IUserService {
    @Override
    public User get(Long id) {
        return new User(1L, "521598", "lsq");
    }
}
