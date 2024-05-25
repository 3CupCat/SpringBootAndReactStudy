package org.example.controller;

import org.example.dto.Result;
import org.example.entity.Users;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        System.out.println(456);
        this.userService=userService;
    }


    @PostMapping("/test")
    public Result test(@RequestBody Users users){
        return userService.test(users);
    }


    @PostMapping("/createUser")
    public Result createUser(@RequestBody Users users){
        return userService.createUser(users);
    }

    @PutMapping("/updateUser")
    public Result updateUser(){
        return userService.updateUser();
    }
    @DeleteMapping("/deleteUser")
    public Result deleteUser(){
        return userService.deleteUser();
    }

    @GetMapping("/getUser/{id}")
    public Result getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }








}
