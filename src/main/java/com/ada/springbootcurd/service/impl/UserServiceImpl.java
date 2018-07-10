package com.ada.springbootcurd.service.impl;

import com.ada.springbootcurd.dao.UserDao;
import com.ada.springbootcurd.pojo.User;
import com.ada.springbootcurd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //@Autowired
    //@Qualifier( value="userDao" )
    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        boolean flag=false;
        userDao.addUser ( user );
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        userDao.updateUser ( user );
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        userDao.deleteUser ( id );
        return false;
    }

    @Override
    public User findUserById(int id) {
        User user = userDao.findUserById ( id );
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> users = userDao.findAll ();
        return users;
    }
}
