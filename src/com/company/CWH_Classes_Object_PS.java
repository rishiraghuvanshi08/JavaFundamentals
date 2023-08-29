package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Friend...");
    }

}
class Square{
    int side;

    public void setSide(int a){
        side = a;
    }
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4 * side;
    }
}
public class CWH_Classes_Object_PS {
    public static void main(String[] args) {
        Employee rishi = new Employee();

//        Problem 1
        rishi.setName("Rishi Roman");
        rishi.salary = 355;
//        System.out.println(rishi.getName());
//        System.out.println(rishi.getSalary());

//        Problem 2
        CellPhone asus = new CellPhone();
//        asus.callFriend();
//        asus.ring();
//        asus.vibrate();

//        Problem 3
        Square sq = new Square();
        sq.setSide(2);
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
