package com.controlworks.work2;

import java.util.Scanner;

public class MainWork2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println(a);
        }
        if(b>a && b>=c){
            System.out.println(b);
        }
        if(c>a && c>b){
            System.out.println(c);
        }

    }
}
