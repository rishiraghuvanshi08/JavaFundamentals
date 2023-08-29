package com.company;

class Circle{
    public int radius;

    public int getRadius() {
        return radius;
    }

    Circle(int r){
        this.radius = r;
    }

    public double areaOfCircle(){
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle{
    int height;

    public int getHeight(){
        return height;
    }

    Cylinder(int r, int h){
        super(r);
        this.height = h;
    }

    public double areaOfCylinder(){
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double volumeOfCylinder(){
        return Math.PI * radius * radius * height;
    }
}

public class CWH_InheritancePracticeSet {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(2,5);

        float areaOfCircle = (float) cy.areaOfCircle();
        System.out.printf("Area of Circle is %.2f\n", areaOfCircle);
        System.out.println("Area of Cylinder is " + cy.areaOfCylinder());
        System.out.println("Volume of Cylinder is " + cy.volumeOfCylinder());
    }
}
