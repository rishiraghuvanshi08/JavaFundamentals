package com.company;

public class CWH_Finally_Block {
    public static int greet(){
        try{
            int a = 3;
            int b = 0;
            int c = a / b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of the program");
        }
        return -1;
    }
    public static void main(String[] args) {
//        int k = greet();
//        System.out.println(k);
        int a = 15;
        int b = 5;
        for (int i = 0; true ; i++){
            try{
                int c = a / b;
                System.out.println(c);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
//                System.out.println("Cleaning the resources... This is the end of the program");
                System.out.println("I am in finally for the value of b = " + b);
            }
            b--;
        }

//        Below Code is a valid code
        try{
            System.out.println(45/0);
        }
        finally {
            System.out.println("Yess, I will be executed.");
        }
    }
}
