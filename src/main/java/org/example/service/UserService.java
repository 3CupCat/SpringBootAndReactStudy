package org.example.service;

import org.example.controller.UserController;
import org.example.dto.Result;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    public Result createUser(){

        return new Result(200,"success");
    }



}
