package com.javacourse.se.lesson25;

public class Mass4 {
    public static void main(String[] args) {
        int[] mass4 = {5, -8, 6, -9, 4, 7, -4, -8, 12, 14, -73};
        int a;
        int sum=0;
        for (int i = 0; i < mass4.length; i++) {
            a = mass4[i] % 2;
            if (mass4[i] > 0 && a==0) {
                sum = sum+mass4[i];
            }
            }
        System.out.println(sum);
        }
    }

