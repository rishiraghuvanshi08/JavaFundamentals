package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CWH_Try_Catch_Block {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 34;
        marks[1] = 84;
        marks[2] = 15;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with : ");
        int num = 1;
        try{
            num = sc.nextInt();
        }
        catch (Exception e){
            System.out.println("Some exception occurred");
            System.out.println(e);
        }

        try{
            System.out.println("The value at array index entered is : " + marks[ind]);
            System.out.println("The value of array-value divided by number is : " + marks[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occurred!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exception occurred!");
            System.out.println(e);
        }

    }
}
