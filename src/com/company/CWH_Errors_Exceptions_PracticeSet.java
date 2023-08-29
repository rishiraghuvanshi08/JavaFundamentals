package com.company;

import java.util.Scanner;

class MyMaxRetries extends Exception{
    @Override
    public String toString() {
        return "Max Tries Reached...";
    }
}

public class CWH_Errors_Exceptions_PracticeSet {
    public static void ex(){
            try{
                throw new MyMaxRetries();
            }
            catch (Exception e){
                System.out.println(e);
            }
    }
    public static void main(String[] args){
//        Problem 1
        // Syntax Error --> int a = 7
        /* Logical Error --> int age = 45;
                            int year_born = 2000 - age;
         */
        // Runtime Error --> int a = 6 / 0;

//        Problem 2
        int [] arr = new int[3];
        arr[0] = 34;
        arr[1] = 4;
        arr[2] = 3;

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        int i = 0;
        while (flag && i<5) {
            System.out.println("Enter Array Index : ");
            int a = sc.nextInt();

            try {
                System.out.println("Value at entered array index is " + arr[a]);
                flag = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException Occurred...");
                System.out.println(e);
                i++;
            } catch (Exception e) {
                System.out.println("Some Exception Occurred...");
                System.out.println(e);
                i++;
            }
        }
        if(i==5){
            ex();
        }

    }
}
