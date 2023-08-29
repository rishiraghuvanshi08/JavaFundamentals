package com.company;

class A {
    int a;

    public int rishi() {
        return 4;
    }
    public void meth2() {
        System.out.println("I'm method of class A" );
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I'm method of class B");
    }
}

public class CWH_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
