package com.company;

public class CWH_MethodsInJava {
    static int logic(int x, int y){
        int z;
        if(x > y){
            z = x + y;
        }
        else{
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
/*
        Method invocation using object creation
        CWH_MethodsInJava object = new CWH_MethodsInJava();
        int c = object.logic(a, b);
*/
        int c = logic(a, b);
        System.out.println(c);

        int a1 = 30;
        int b1 = 20;
        int c1 = logic(a1, b1);
        System.out.println(c1);

    }
}
