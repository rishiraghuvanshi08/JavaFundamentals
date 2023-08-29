package com.company;

public class CWH_Recursion_Java {
    static int factorial(int x){
        if(x == 1 || x == 0){
            return 1;
        }
        else{
            return x * factorial(x-1);
        }
    }
    static int factorial_iterative(int x){
        if(x == 1 || x == 0){
            return 1;
        }
        else{
            int fact = 1;
            for(int i = 1; i <= x; i++){
                fact *= i;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        System.out.println("The factorial is : " + factorial(5));
        System.out.println("The factorial is : " + factorial_iterative(5));
    }
}
