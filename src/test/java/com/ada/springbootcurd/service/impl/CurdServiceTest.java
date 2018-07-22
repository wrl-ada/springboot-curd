package com.ada.springbootcurd.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith ( SpringRunner.class )
@SpringBootTest
public class CurdServiceTest {
    @Autowired
    private CurdService service;

    @Test
    public void findByAge() {
        service.findByAge (12);
    }
}