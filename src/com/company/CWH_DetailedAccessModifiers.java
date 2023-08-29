package com.company;

class C1{
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;

    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class CWH_DetailedAccessModifiers {
    public static void main(String[] args) {
        C1 c = new C1();
//        c.meth1();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        // System.out.println(c.d);
    }
}
