package com.example.petshop;

import java.util.Date;

public class Dog extends Pet_Java {

    public Dog(String name){

        super(name);

    }
    public Dog(String name, Date birthdate) {

        super (name, birthdate);

    }

    @Override
    public String speak() {
        return "Bark";
    }
}
