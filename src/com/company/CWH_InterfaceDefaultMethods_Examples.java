package com.company;

interface MyCamera{
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
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi{
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

public class CWH_InterfaceDefaultMethods_Examples {
    public static void main(String[] args) {
        MySmartPhone onePlus = new MySmartPhone();
        String[] networkList = onePlus.getNetworks();
        for (String element: networkList
             ) {
            System.out.println(element);
        }

        onePlus.connectToNetwork("Rishi");
        onePlus.record4k();

    }
}
