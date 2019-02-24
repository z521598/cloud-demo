package com.baidu.microserivicesimpleconsumer.service;

import com.baidu.microserivicesimpleconsumer.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Administrator on 2019/2/23.
 */
@Component
public class UserNetServiceFallback implements IUserNetService{
    @Override
    public User get( Long id) {
        return new User(11L,"z521598","zdh");
    }
}
