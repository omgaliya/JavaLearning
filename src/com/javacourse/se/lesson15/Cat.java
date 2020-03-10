package com.javacourse.se.lesson15;

public class Cat {
    public String name;
    public int age;
    public boolean isSmart = false;

    public Cat (String name, int age, boolean isSmart){
        this.name = name;
        this.age = age;
        this.isSmart = isSmart;
    }
    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }
}
