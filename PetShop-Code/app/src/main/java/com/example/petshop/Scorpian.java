package com.example.petshop;

import java.util.Date;
//
public class Scorpian extends Pet_Java { // I named my Scorpion, as Scorpian

    public Scorpian(String name){

        super(name);

    }
    public Scorpian(String name, Date birthdate) {

        super (name, birthdate);

    }

    @Override
    public String speak() {
        return "Hiss";
    }
}
