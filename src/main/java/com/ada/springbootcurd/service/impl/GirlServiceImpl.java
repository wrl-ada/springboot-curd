package com.ada.springbootcurd.service.impl;

import com.ada.springbootcurd.dao.GirlRespository;
import com.ada.springbootcurd.pojo.Girl;
import com.ada.springbootcurd.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GirlServiceImpl implements GirlService {
    @Autowired
    private GirlRespository girlJpa;

    @Override
    public Girl addGril(Girl girl) {
        return girlJpa.save ( girl );
    }

    @Override
    public Girl updateGirl(Girl girl) {
        return girlJpa.save ( girl );
    }

    @Override
    public void deleteGirl(Girl girl) {
        girlJpa.delete ( girl );
    }

    @Override
    public Optional<Girl> selectGirl(int id) {
       return girlJpa.findById ( id );
    }

    @Override
    public List<Girl> findAll() {
        return girlJpa.findAll ();
    }

    @Override
    public List<Girl> findByAge(int age) {
        return girlJpa.findByAge ( age );
    }
}
