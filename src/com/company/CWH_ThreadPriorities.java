package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int x = 0;
        while(x < 1000){
            System.out.println("Thank You " + this.getName());
            x++;
        }
    }
}

public class CWH_ThreadPriorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Rishi1");
        MyThr1 t2 = new MyThr1("Rishi2");
        MyThr1 t3 = new MyThr1("Rishi3");
        MyThr1 t4 = new MyThr1("Rishi4");
        MyThr1 t5 = new MyThr1("Rishi5 (Max Priority)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
