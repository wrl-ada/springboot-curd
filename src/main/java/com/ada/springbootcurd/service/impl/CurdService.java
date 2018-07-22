package com.ada.springbootcurd.service.impl;

import com.ada.springbootcurd.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurdService {
    @Autowired
    private GirlService girlService;

    public void findByAge(int i){
        girlService.findByAge ( 28 );
    }

}
