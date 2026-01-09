package com.example.petshop;

import java.util.Date;

public class Cat extends Pet_Java implements Pettable {

    public Cat(String name){

        super(name);

    }
    public Cat(String name, Date birthdate) {

        super (name, birthdate);

    }

    @Override
    public String speak() {
        return "meow";
    }
    public void pet() {
    }
}
