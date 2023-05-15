package com.example.springday2.Model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Farm {

    @Autowired
    public Farm(){
    }
    @Qualifier("COW")
    Animal animal;
}
