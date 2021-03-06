package com.example.product.service;

import com.example.product.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service")
public interface UserService {

    @RequestMapping("user/get")
    User getUser(@RequestParam("id") int id);

}
