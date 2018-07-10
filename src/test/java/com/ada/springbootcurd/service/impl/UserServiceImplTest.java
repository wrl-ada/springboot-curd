package com.ada.springbootcurd.service.impl;

import com.ada.springbootcurd.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

import static org.junit.Assert.*;

@RunWith( SpringRunner.class )
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserServiceImpl service;

    @Test
    public void addUser() {
        User user=new User ( "zhangsan", 18 );
        User user2=new User ( "zhangsan", 17 );
        service.addUser ( user );
        service.addUser ( user2 );
    }

    @Test
    public void updateUser() {
        User user=new User ( 2, "zhangsan", 17 );
        service.updateUser ( user );
    }

    @Test
    public void deleteUser() {
        service.deleteUser ( 2 );
    }

    @Test
    public void findUserById() {
        User user=service.findUserById ( 1 );
        System.out.print ( user.getName () + "," + user.getAge () );
    }

    @Test
    public void findAll() {
        List<User> users=service.findAll ();
        for (User user : users) {
            System.out.print ( user.toString () );
        }
    }
}