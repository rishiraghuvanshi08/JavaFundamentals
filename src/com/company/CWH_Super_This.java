package com.company;

class This{
    int a;

    public int getA() {
        return a;
    }
    This(int a){
        this.a = a;
    }
}

class Super extends This{
    Super(){
        super(3);
        System.out.println("I'm a constructor");
    }
}

public class CWH_Super_This {
    public static void main(String[] args) {
         // This t = new This(5);
         // System.out.println(t.getA());
        Super s = new Super();

    }
}
