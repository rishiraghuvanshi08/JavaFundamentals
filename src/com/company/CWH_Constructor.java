package com.company;

class MyMainEmployee{
    private int id;
    private String name;
    private int salary;

    public MyMainEmployee(){
        id = 23;
        name = "Pro Card Holder Rishi";
    }
    public MyMainEmployee(String myName, int a){
        id = a;
        name = myName;
    }
    public MyMainEmployee(String myName, int a, int s){
        id = a;
        name = myName;
        salary = s;
    }
    public void setId(int a){
        id = a;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public int getSalary() { return salary; }
}
public class CWH_Constructor {
    public static void main(String[] args) {
        MyMainEmployee rishi = new MyMainEmployee("IFBB Pro Rishi", 11, 20000);
//        rishi.setId(54);
//        rishi.setName("Code With Rishi");
        System.out.println(rishi.getId());
        System.out.println(rishi.getName());
        System.out.println(rishi.getSalary());
    }
}
