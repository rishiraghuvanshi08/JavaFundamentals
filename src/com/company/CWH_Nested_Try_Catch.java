package com.company;

import java.util.Scanner;

public class CWH_Nested_Try_Catch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 34;
        marks[1] = 84;
        marks[2] = 15;

        Scanner sc = new Scanner(System.in);


        boolean flag = true;
        while(flag){
            System.out.println("Enter the array index : ");
            int ind = sc.nextInt();
            try{
                System.out.println("Hello CODEWITHHARRY Programmers");
                try{
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("ArrayIndexOutOfBoundsException occurred");
                    System.out.println(e);
                }
                System.out.println("I am learning java by codewithharry tutorials");
            }
            catch (Exception e){
                System.out.println("Some exception occurred!");
                System.out.println(e);
            }
        }
    }
}
