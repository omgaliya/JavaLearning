package com.javacourse.se.lesson11;

public class OperatorSwitch {
    final int VALUE=5, firstValue=1, secondValue=2, thirdValue=3;

    public void foo(){
     switch(VALUE){
         case firstValue:
             System.out.println(firstValue);
             break;
         case secondValue:
             System.out.println(secondValue);
             break;
         case thirdValue:
             System.out.println(thirdValue);
             break;
         default:
             System.out.println("Default");
        }
    }
}
