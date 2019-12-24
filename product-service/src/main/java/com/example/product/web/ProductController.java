package com.example.product.web;

import com.example.product.entity.User;
import com.example.product.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private UserService userService;

    @RequestMapping("buy")
    public User buy(){
        return userService.getUser(1);
    }
}
