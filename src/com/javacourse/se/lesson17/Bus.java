package com.javacourse.se.lesson17;

public class Bus {

    public String model, color;
    public Engine engine = new Engine("V8");
    public Transmission transmission;
    public final String SERIAL_NUMBER = "023";
    public final int SERIAL_NUMBER_2 = 025;

    public void Go(String svinka){
        if(engine.getType().equals("V8")){
            System.out.println("можем ехац, "+ svinka);
        }
    }

    public void showKm(int km){
        System.out.println(km);
    }

}
