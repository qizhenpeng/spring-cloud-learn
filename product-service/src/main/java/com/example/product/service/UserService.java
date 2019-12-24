package com.example.product.service;

import com.example.product.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URI;

@FeignClient(name = "user-service")
public interface UserService {

    @RequestMapping("user/get")
    User getUser(URI uri,@RequestParam("id") int id);

}
