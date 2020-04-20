package com.javacourse.se.lesson25;

public class Mass3 {
    public static void main(String[] args) {
        int [] mass3 = {10,-3,-5,2,5,1};
        int minimum=mass3[0];
        int i=0;
        int index = 0;

        while (i<mass3.length){
            if(mass3[i]<0){
                mass3[i]=-mass3[i];
            }
            if(mass3[i]<minimum){
                minimum=mass3[i];
                index=i;
            }
            i++;
        }
        System.out.println(index);


    }
}
