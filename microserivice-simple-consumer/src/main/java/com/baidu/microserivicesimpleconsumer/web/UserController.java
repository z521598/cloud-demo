package com.baidu.microserivicesimpleconsumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.baidu.microserivicesimpleconsumer.bean.User;
import com.baidu.microserivicesimpleconsumer.service.IUserNetService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/rest/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IUserNetService userNetService;

    @RequestMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return restTemplate.getForObject("http://microserivice-simple-user-provider/rest/user/" + id, User.class);
    }

    @HystrixCommand(fallbackMethod = "getByNetFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")})
    @RequestMapping("/{id}/net")
    public User getByNet(@PathVariable Long id) throws InterruptedException {
        if (id == 1) {
            throw new RuntimeException("id==1");
        }
        if (id == 2) {
            Thread.sleep(2000);
        }
        return userNetService.get(id);
    }

    private User getByNetFallback(Long id) {
        return new User();
    }

}
