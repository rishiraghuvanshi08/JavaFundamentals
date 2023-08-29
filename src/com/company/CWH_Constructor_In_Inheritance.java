package com.company;

class Base2{
    public Base2(){
        System.out.println("I'm a constructor.");
    }
    public Base2(int x){
        System.out.println("I'm an overloaded constructor. x = " + x);
    }
}

class Derived2 extends Base2{
    public Derived2(){
        System.out.println("I'm a derived class constructor.");
    }
    public Derived2(int x, int y){
        super(x);
        System.out.println("I'm an overloaded constructor of derived, y = " + y);
    }
}

class ChildOfDerived extends Derived2{
    public ChildOfDerived() {
        System.out.println("I'm child of derived");
    }
    public ChildOfDerived(int a, int b, int c) {
        //super(a, b);
        System.out.println("I'm overloaded constructor and child of derived, z = " + c);
    }
}
public class CWH_Constructor_In_Inheritance {
    public static void main(String[] args) {
        // Base2 b = new Base2();
        // Derived2 d = new Derived2();
        // Derived2 d = new Derived2(4, 56);
        ChildOfDerived c = new ChildOfDerived(17,18,19);
    }
}
