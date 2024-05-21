package org.example.controller;

import org.example.dto.Result;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        System.out.println(456);
        this.userService = userService;
    }

    @GetMapping("/test")
    public Result test(){
        System.out.println(123);
        return new Result(200,"success");
    }
    @PostMapping("/test")
    public Result test2(){
        System.out.println(456);
        return new Result();
    }

    @PostMapping("/createUser")
    public Result createUser(){
        System.out.println(456);
        return new Result();
    }



}
