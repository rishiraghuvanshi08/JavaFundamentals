package com.company;

import java.util.Scanner;

public class CWH_Errors_Demo {
    public static void main(String[] args) {
        /* Syntax Errors
        int a = 3   --> Error: No Semicolon!
        b = 3;   --> Error: b is not declared!
         */

        /* Logical Error
        Write a program to print all the prime numbers between 1 to 10
        System.out.println(2);
        for (int i = 1; i < 5; i++){
            System.out.println(2 * i + 1);
        }
         */

        // Runtime Error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is " + 1000 / k);

    }
}
