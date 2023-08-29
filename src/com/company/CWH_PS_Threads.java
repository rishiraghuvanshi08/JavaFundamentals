package com.company;

class ThreadPractice extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Good Morning");
        }
    }
}

class ThreadPractice1 extends Thread{
    public void run(){
//        while(true){
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Welcome");
//        }
    }
}

public class CWH_PS_Threads {

    public static void main(String[] args) {
        ThreadPractice t1 = new ThreadPractice();
        ThreadPractice1 t2 = new ThreadPractice1();
        t1.setPriority(1);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t2.getState());
//        t1.start();
        t2.start();
        System.out.println(t2.getState());
        System.out.println(t2.currentThread().getState());
    }
}
