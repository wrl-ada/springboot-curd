package com.ada.springbootcurd.web;

import com.ada.springbootcurd.pojo.User;
import com.ada.springbootcurd.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl service;
    private String result;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        if(service.addUser ( user )){
            result = "新增成功";
        }else{
            result = "新增失败";
        }
        return result;
    }

    @GetMapping("/all")
    public void getAll(){
        List<User> all = service.findAll ();
        for(User user:all){
            System.out.print ( user.getName () );

        }
    }


}
