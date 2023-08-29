package com.company;

public class CWH_Varargs_Java {
    static int sum(int x, int ...arr){
        int result = x;
        for (int element: arr) {
            result += element;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 2 and 5 is : " + sum( 2));
        System.out.println("The sum of 2 and 5 is : " + sum(2, 5));
        System.out.println("The sum of 2, 3 and 5 is : " + sum(2, 3, 5));
        System.out.println("The sum of 2, 3, 4 and 5 is : " + sum(2, 3, 4, 5));
    }
}
