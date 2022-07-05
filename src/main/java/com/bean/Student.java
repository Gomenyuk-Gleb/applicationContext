package com.bean;

import com.annotation.Bean;
import com.annotation.Inject;
import com.bean.People;

@Bean("test")
public class Student implements People {
    String name = "Gleb";

    @Inject
    Programmer programmer;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
