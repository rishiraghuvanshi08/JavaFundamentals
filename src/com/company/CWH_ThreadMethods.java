package com.company;

class MyThr2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thank You");
        }
    }
}

class MyThr3 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class CWH_ThreadMethods {
    public static void main(String[] args) {
        MyThr2 t1 = new MyThr2();
        MyThr3 t2 = new MyThr3();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//            System.out.println(123);
//        }
        t2.start();
    }
}
