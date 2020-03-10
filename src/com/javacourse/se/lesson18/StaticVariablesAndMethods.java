package com.javacourse.se.lesson18;

public class StaticVariablesAndMethods {
    public static int variables;
    public int variables2;
    static {
        variables = foo(1);
    }

    public static int foo(int x) {
        if (variables > 0) {
            System.out.println(variables);
        }
        System.out.println(x);
        return 1;
    }

    public void show(){
        System.out.println("No");
    }
}
