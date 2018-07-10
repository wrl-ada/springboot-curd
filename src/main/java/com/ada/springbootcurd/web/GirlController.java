package com.ada.springbootcurd.web;

import com.ada.springbootcurd.dao.GirlRespository;
import com.ada.springbootcurd.pojo.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GirlController {
    @Autowired
    private GirlRespository grilRespository;

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/getAll")
    public List<Girl> grilList(){
        return grilRespository.findAll ();
    }

    @GetMapping("/addGirl/{age}/{name}")
    public Girl addGirl(@PathVariable("age") Integer age, @PathVariable("name") String name){
        Girl girl = new Girl ();
        girl.setAge ( age );
        girl.setName ( name );
        return grilRespository.save ( girl );
    }

    /**
     * http://localhost:8081/girl/saveGirl?age=27&name=mokey
     * @param age
     * @param name
     * @return
     */
    @GetMapping("/saveGirl")
    public Girl saveGirl(@RequestParam("age") Integer age, @RequestParam("name") String name){
        Girl girl = new Girl ();
        girl.setAge ( age );
        girl.setName ( name );
        return grilRespository.save ( girl );
    }

}
