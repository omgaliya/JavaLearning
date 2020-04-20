package com.javacourse.se.lesson25;

public class Mass1 {
    public static void main(String[] args) {
        int[] mass = {1, 5, 9, 6, 3, 5, 2, 4};
        int maxElement=0;

        for (int i=0;i<mass.length;i=i+2){
            if(mass[i]>maxElement){
                maxElement=mass[i];
            }
        }
        System.out.println(maxElement);
    }
}