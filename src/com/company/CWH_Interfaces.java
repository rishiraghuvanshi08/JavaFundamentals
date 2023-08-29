package com.company;

interface Bicycle{
    int a = 32;
    void speedUp(int increment);
    void applyBrake(int decrement);
    // int fuel(); --> any datatype can be used
}
interface fuelMeter{
    void enoughFuel();
    default void lowFuel() {
        System.out.println("Fuel tank is low");
    }
}

class CompanyBikes{
    public void topSeries(){
        System.out.println("Top series is T1");
    }
    public void baseSeries(){
        System.out.println("Base series is B");
    }
}

class AvonCycle extends CompanyBikes implements Bicycle, fuelMeter{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void enoughFuel(){
        System.out.println("You have enough fuel");
    }

}

public class CWH_Interfaces {
    public static void main(String[] args) {
        AvonCycle skBikes = new AvonCycle();

        skBikes.applyBrake(3);
        skBikes.blowHorn();
        skBikes.speedUp(5);
        System.out.println(skBikes.a); // value of a is final, cannot be changed
        // skBikes.a = 45; --> throws error
        skBikes.enoughFuel();
        skBikes.lowFuel();
        skBikes.topSeries();
        skBikes.baseSeries();
    }
}
