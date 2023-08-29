package com.company;

class Phone{
    public void showTime(){
        System.out.println("Time is 8am.");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music.");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class CWH_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.on();
    }
}
