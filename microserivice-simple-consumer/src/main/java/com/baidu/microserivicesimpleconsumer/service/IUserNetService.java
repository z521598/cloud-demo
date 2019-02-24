package com.baidu.microserivicesimpleconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baidu.microserivicesimpleconsumer.bean.User;

@FeignClient(name = "microserivice-simple-user-provider",fallback = UserNetServiceFallback.class)
public interface IUserNetService {
    @RequestMapping(value = "/rest/user/{id}", method = RequestMethod.GET)
    User get(@PathVariable(value = "id") Long id);
}
