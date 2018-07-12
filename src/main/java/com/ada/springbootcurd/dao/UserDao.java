package com.ada.springbootcurd.dao;

import com.ada.springbootcurd.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserDao {

    @Insert( "insert into t_user(id,name,age) values(#{id},#{name},#{age})" )
    void addUser(User user);

    @Delete ( "delete from t_user where id=#{id}" )
    void deleteUser(int id);

    @Update ( "update t_user set name=#{name},age=#{age} where id =#{id}" )
    void updateUser(User user);

    @Select ( "select * from t_user where id=#{id}" )
    User findUserById(int id);

    @Select( "select * from t_user" )
    List<User> findAll();

}
