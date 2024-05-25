package org.example.service;

import org.example.controller.UserController;
import org.example.dao.UserDao;
import org.example.dto.Result;
import org.example.dto.UserDTO;
import org.example.entity.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao){
        this.userDao=userDao;
    }

    public Result createUser(Users users){
        System.out.println(users);
        userDao.save(users);
        return new Result(200,"success");
    }

    public Result updateUser(){
        Users users = new Users();
        users.setUserId(1);
        users.setMail("s87034");
        userDao.save(users);
        return new Result(200,"success");
    }

    public Result deleteUser(){

        userDao.deleteById(1);
        return new Result(200,"success");
    }


    public Result getUser(Integer id){
        Optional<Users> usersOptional =userDao.findById(id);
        if(usersOptional.isPresent()){
            return new Result(200,usersOptional.get());
        }else {
            return new Result(9999,"no data");
        }
    }

    public Result test(Users users){
        List<Users> list=userDao.findByMailJPql(users.getMail());
        return new Result(200,list);
    }

}
