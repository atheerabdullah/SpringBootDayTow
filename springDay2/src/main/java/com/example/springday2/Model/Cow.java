package com.example.springday2.Model;

import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal {
    public void makeNoise() {
        {
            System.out.println("Moo");
        }
    }



}
