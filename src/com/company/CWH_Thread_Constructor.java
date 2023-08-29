package com.company;

class MyThr extends Thread implements Runnable{
    public MyThr(int i, String name){
        super(name);
        System.out.println(i);
    }
    public void run(){
        System.out.println("Thank You");
    }
}
public class CWH_Thread_Constructor {
    public static void main(String[] args) {
//        MyThr t1 = new MyThr("Rishi");
//        MyThr t2 = new MyThr("Roman");
//        t1.start();
//        t2.start();
//        System.out.println("The ID of thread t is " + t1.getId());
//        System.out.println("The Name of thread t is " + t1.getName());
//        System.out.println("The ID of thread t is " + t2.getId());
//        System.out.println("The Name of thread t is " + t2.getName());


        MyThr bullet1 = new MyThr(23,"rishi");
        Thread gun1 = new Thread(bullet1);

        gun1.start();
        System.out.println("The ID of thread t is " + gun1.getId());
        //gun1.setName("Rishi");
        System.out.println("The Name of thread t is " + gun1.getName());
    }
}
