package com.company;

class Cylinder1{
    private int radius;
    private int height;

    public Cylinder1(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}

public class CWH_AccessModifiers_PS {
    public static void main(String[] args) {
        /*
        Cylinder1 cy = new Cylinder1(9,12);

        //cy.setHeight(12);
        System.out.println(cy.getHeight());
        //cy.setRadius(9);
        System.out.println(cy.getRadius());

        System.out.println(cy.surfaceArea());
        System.out.println(cy.volume());

         */
        Rectangle rec = new Rectangle(10, 20);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
    }
}
