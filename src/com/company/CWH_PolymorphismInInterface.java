package com.company;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4k(){
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWifi2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Rishi", "Vishal", "Ashu"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

public class CWH_PolymorphismInInterface {
    public static void main(String[] args) {
        MyCamera2 cam = new MySmartPhone2();    // This is a SmartPhone but use it as a camera

//        cam.getNetworks();  --> Not Allowed
        cam.record4k();

        MySmartPhone2 mi = new MySmartPhone2();

        mi.connectToNetwork("Rishi");
        mi.callNumber(15);
    }
}
