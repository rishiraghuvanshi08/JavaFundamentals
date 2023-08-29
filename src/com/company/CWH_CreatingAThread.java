package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 10000){
            System.out.println("Cooking... Thread 1");
            System.out.println("I am Happy");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 10000){
            System.out.println("Chatting... Thread 2");
            System.out.println("I am Sad");
            i++;
        }
    }
}

public class CWH_CreatingAThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
