package com.javacourse.se.lesson25;

import java.util.Scanner;

public class Mass2{
    public static void main(String[] args) {

        int[] num = new int[5];
        int[] num2 = new int[5];
        int[] num3 = new int[5];
        int i = 0;
        Scanner sc = new Scanner(System.in);

        while (i<num.length){
            num[i]=(int) (Math.random() * (201) - 100);
            System.out.println("num["+ i+ "] = " +num[i]);
            System.out.print("Введи число num2["+i+"]:");
            num2[i]=sc.nextInt();
            num3[i]=num[i]+num2[i];
            System.out.println("summ = "+num3[i]);
            i++;
        }

    }
}
