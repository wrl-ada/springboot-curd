package com.ada.springbootcurd.service.impl;

import com.ada.springbootcurd.pojo.Girl;
import com.ada.springbootcurd.service.GirlService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith( SpringRunner.class )
@SpringBootTest
public class GirlServiceImplTest {
    @Autowired
    private GirlServiceImpl girlService;

    @Test
    public void addGril() {
        Girl girl=new Girl ( "lisi", 17 );
        girlService.addGril ( girl );
    }

    @Test
    public void updateGirl() {
        Girl girl=new Girl ();
        girl.setId ( 3 );
        girl.setName ( "Tom" );
        girl.setAge ( 18 );
        girlService.updateGirl ( girl );
    }

    @Test
    public void deleteGirl() {
        Girl girl=new Girl ();
        girl.setId ( 3 );
        girl.setName ( "Tom" );
        girl.setAge ( 18 );
        girlService.deleteGirl (girl);
    }

    @Test
    public void selectGirl() {
        Optional<Girl> girl = girlService.selectGirl ( 1 );
        System.out.print ( girl.toString ());
    }

    @Test
    public void findAll() {
        List<Girl> girls = girlService.findAll ();
        for (Girl girl:girls){
            System.out.print ( girl.toString () );
        }
    }

    @Test
    public void findByAge() {
        List<Girl> girl = girlService.findByAge ( 18 );
        System.out.print ( girl.size () );
    }
}