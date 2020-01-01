package com.example.hystrix.service;

import com.example.hystrix.entity.User;
import org.springframework.stereotype.Component;

@Component
public class FeignUserFallbackService implements FeignUserService {
    @Override
    public User getUser(int id) {
        return new User(id,"feign default user");
    }
}
