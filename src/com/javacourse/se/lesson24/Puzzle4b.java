package com.javacourse.se.lesson24;

 class Puzzle4b {
 int ivar;
 public int doStuff(int factor){
     if(ivar>100){
         return ivar*factor;
     }
     else{
         return ivar*(5-factor);
     }
     }
}
