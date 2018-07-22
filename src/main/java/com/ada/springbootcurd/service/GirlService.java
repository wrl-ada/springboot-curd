package com.ada.springbootcurd.service;

import com.ada.springbootcurd.pojo.Girl;

import java.util.List;
import java.util.Optional;

public interface GirlService {
    Girl addGril(Girl girl);

    Girl updateGirl(Girl girl);

    void deleteGirl(Girl girl);

    Optional<Girl> selectGirl(int id);


    List<Girl> findAll();

    List<Girl> findByAge(int age);
}
