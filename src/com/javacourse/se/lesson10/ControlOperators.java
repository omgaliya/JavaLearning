package com.javacourse.se.lesson10;

public class ControlOperators {
    int a=5, b=7;
    boolean value = false;

    public void foo(){
        a+=2;

        if(value){
            System.out.println("True1");

            if(a<b){
                System.out.println("Yes");
            }
        } else if(b<a){
            System.out.println("False");
        } else {
            System.out.println("AAAAA");
        }
    }
}
