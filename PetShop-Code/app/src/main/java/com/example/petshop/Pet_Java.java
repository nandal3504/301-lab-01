package com.example.petshop;

import java.util.Date;

public abstract class Pet_Java {
            private String name;
            private Date birthdate;

            public Pet_Java(String name){
                this.name = name;
                this.birthdate = new Date();
            }

            public Pet_Java(String name, Date birthdate){
                this.name=name;
                this.birthdate= birthdate;
            }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public abstract String speak();
}
