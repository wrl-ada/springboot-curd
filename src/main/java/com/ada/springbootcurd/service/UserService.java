package com.ada.springbootcurd.service;

import com.ada.springbootcurd.pojo.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserService {
    // 添加用户
    boolean addUser(User user);

    //修改用户
    boolean updateUser(User user);

    //删除用户
    boolean deleteUser(int id);

    //根据用户名查取用户信息
    User findUserById(int id);

    //查询所有用户
    List<User> findAll();

    void insertTwo(List<User> users);
}
