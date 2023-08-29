package com.company;

import jdk.dynalink.beans.StaticClass;

public class CWH_Methods_Overloading {
    static void rishi(){
        System.out.println("Good Morning Love");
    }
    static void rishi(String name){
        System.out.println("Good Morning " + name + " Love");
    }
    static void rishi(int a, String name){
        System.out.println("Good Morning " + a + " " + name + " Love");
    }
    static void change1(int x){
        x = 235;
    }
    static void change2(int [] a){
        a[0] = 100;
    }
    public static void main(String[] args) {
/*
        Case 1: Changing the integer
        int a = 342;
        change1(a);
        System.out.println(a);

        Case 2: Changing the array
        int [] arr = {23, 43, 54, 86, 45};
        change2(arr);
        System.out.println(arr[0]);
*/

//        Method Overloading
        rishi();
        rishi("My");
        rishi(3000, "My");

    }
}
