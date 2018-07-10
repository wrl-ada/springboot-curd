package com.ada.springbootcurd.dao;

import com.ada.springbootcurd.pojo.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRespository extends JpaRepository<Girl,Integer> {
}
