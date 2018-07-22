package com.ada.springbootcurd.dao;

import com.ada.springbootcurd.pojo.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRespository extends JpaRepository<Girl,Integer> {
    //自定义
    List<Girl> findByAge(int age);
}
