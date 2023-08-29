package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
public class CWH_Exception_Class {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        if(i < 9){
            try{
                //throw  new MyException();
                throw  new ArithmeticException("This is an exception");
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes");
        }
    }
}
