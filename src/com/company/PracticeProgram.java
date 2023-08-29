package com.company;

import javax.xml.parsers.SAXParser;
import java.util.Scanner;

public class PracticeProgram {
    public static void main(String[] args) {

        int number, a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        number = sc.nextInt();

        a = number % 10;    // 4
        b = number / 10;    // 23
        c = b % 10;         // 3
        d = b / 10;         // 2

        int reverse = a * 100 + c * 10 + d;
        System.out.println("Reverse is " + reverse);
        int sum = a + c + d;
        System.out.println("Sum of digits is " + sum);

    }
}