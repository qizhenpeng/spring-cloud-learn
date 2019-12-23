package com.example.user.web;

import com.example.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
@RequestMapping("user")
public class UserController {

    @RequestMapping("get")
    public User getUser(@RequestParam("id") int id, HttpServletRequest request){
        log.info("service port:{},get user for id:{}",request.getServerPort(),id);
        return new User(id,"user");
    }

}
