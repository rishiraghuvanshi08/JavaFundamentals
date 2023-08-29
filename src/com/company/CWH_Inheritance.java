package com.company;

class Base{
    int x;

    public int getX(){
        return x;
    }
    public void  setX(int x){
        System.out.println("I'm is base class and i am setting x.");
        this.x = x;
    }
    public Base(){
        System.out.println("I'm a constructor in base.");
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CWH_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(234);
        System.out.println(d.getX());
        //System.out.println(d.printMe());
    }
}
