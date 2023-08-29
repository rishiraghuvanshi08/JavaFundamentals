package com.company;

class Employee1{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My name is " + name + " and my id is " + id);
    }
    public int getSalary(){
        return salary;
    }
}
public class CWH_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 rishi = new Employee1();    // Instantiating a new Employee Object
        Employee1 roman = new Employee1();

        // Setting Attributes
        rishi.id = 12;
        rishi.name = "Rishi";
        rishi.salary = 35;
        roman.id = 15;
        roman.name = "Joe Anoei";
        roman.salary = 25;

        // Printing the attributes
        rishi.printDetails();
        roman.printDetails();
        // System.out.println(rishi.id + "\n" + rishi.name);
        int salary = rishi.getSalary();
        System.out.println(salary);
        int salary1 = roman.getSalary();
        System.out.println(salary1);
    }
}
