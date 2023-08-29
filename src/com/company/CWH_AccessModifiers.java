package com.company;

class MyEmployee{
    private int id;
    private String name;

    public void setId(int a){
        this.id = a;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
}
public class CWH_AccessModifiers {
    public static void main(String[] args) {
        MyEmployee ronnie = new MyEmployee();

        ronnie.setId(15);
        ronnie.setName("Coleman");
        System.out.println(ronnie.getId() + " " + ronnie.getName());
    }
}
