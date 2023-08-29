package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("I'm constructor of parent");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning.");
    }
    @Override
    public void greet2(){
        System.out.println("Good evening");
    }
}

abstract class Child2 extends Parent{
    public void rishi(){
        System.out.println("I'm rishi");
    }
}

public class CWH_Abstract {
    public static void main(String[] args) {
        // Parent p = new Parent();     we cannot create object of an abstract class
        // Child2 c = new Child2();
        Child c = new Child();
        c.sayHello();
        c.greet2();
    }
}
