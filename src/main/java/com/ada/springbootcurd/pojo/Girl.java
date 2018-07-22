package com.ada.springbootcurd.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 该类对应数据库springboot的gril表
 * application.properties 中jpa的
 * ddl-auto为create时回自动生成gril表，若gril表存在则会删除再建
 * ddl-auto为update时，不会删掉gril表
 * ddl-auto为create-drop.应用停止时会删表
 * ddl-auto为none，什么也不做
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
        super ();
        this.name=name;
        this.age=age;
    }

    public void setId(int id) {
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
