package com.javacourse.se.lesson14;

public class Candy {
    String name;

    public Candy(String name){
        this.name = name;
    }

    public Candy(){}

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                '}';
    }
}
