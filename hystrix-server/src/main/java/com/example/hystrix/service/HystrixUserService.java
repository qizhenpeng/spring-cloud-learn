package com.example.hystrix.service;


import com.example.hystrix.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class HystrixUserService {

    @HystrixCommand(fallbackMethod="defaultUser")
    public User getUser(int id) throws Exception {
        if(id==1){
            return new User(1,"real user");
        }else{
            throw new Exception("111");
        }
    }

    public User defaultUser(int id){
        return new User(id,"default user");
    }
}
