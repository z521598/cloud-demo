package com.baidu.microserivicesimpleprovider.service;

import org.springframework.stereotype.Service;

import com.baidu.microserivicesimpleprovider.bean.User;

@Service
public class UserService implements IUserService {
    @Override
    public User get(Long id) {
        return new User(1L, "521598", "lsq");
    }
}
