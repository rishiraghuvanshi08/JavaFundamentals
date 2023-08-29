package com.company;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Invalid Input";
    }

    @Override
    public String getMessage() {
        return "Invalid Input";
    }
}

class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by zero";
    }

    @Override
    public String getMessage() {
        return "Cannot divide by zero";
    }
}

class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Maximum input can be 1000000";
    }

    @Override
    public String getMessage() {
        return "Cannot divide by zero";
    }
}

class Calculator{
    public int addition(int a, int b) throws InvalidInputException, MaxInputException{
        if (a > 1000000 || b > 1000000){
            throw new MaxInputException();
        }
        if ((a==8 && b==9) || (b==8 && a==9)){
            throw new InvalidInputException();
        }
        return a + b;
    }

    public int substration(int a, int b) throws MaxInputException{
        if (a > 1000000 || b > 1000000){
            throw new MaxInputException();
        }
        return a - b;
    }

    public int multiplication(int a, int b) throws MaxInputException{
        if (a > 1000000 || b > 1000000){
            throw new MaxInputException();
        }
        return a * b;
    }

    public double division(int a, int b) throws CannotDivideByZeroException, MaxInputException{
        if (a > 1000000 || b > 1000000){
            throw new MaxInputException();
        }
        if (b==0){
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

public class CWH_Custom_Calculator_Exercise {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException{
        Calculator c = new Calculator();
        System.out.println(c.addition(9,10002546));

        System.out.println(c.division(50,10));
    }
}
