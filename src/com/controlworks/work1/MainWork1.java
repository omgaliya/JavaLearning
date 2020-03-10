package com.controlworks.work1;

import java.util.Random;
import java.util.Scanner;

public class MainWork1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     float radius = sc.nextFloat();
     float h = sc.nextFloat();
        System.out.println("S="+ 2*Math.PI*radius*(h+radius));
    }
}
