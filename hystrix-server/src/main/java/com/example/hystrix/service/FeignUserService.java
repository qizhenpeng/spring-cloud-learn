package com.example.hystrix.service;

import com.example.hystrix.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service",fallback = FeignUserFallbackService.class)
public interface FeignUserService {

    @RequestMapping("user/get")
    User getUser(@RequestParam("id") int id);
}
