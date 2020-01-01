package com.example.hystrix.web;

import com.example.hystrix.entity.User;
import com.example.hystrix.service.FeignUserService;
import com.example.hystrix.service.HystrixUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {

    @Autowired
    private HystrixUserService hystrixUserService;
    @Autowired
    private FeignUserService feignUserService;

    @RequestMapping("user")
    public User getUser(@RequestParam("id")int id) throws Exception {
        return hystrixUserService.getUser(id);
    }

    @RequestMapping("feign/user")
    public User getUser1(@RequestParam("id")int id) {
        return feignUserService.getUser(id);
    }
}
