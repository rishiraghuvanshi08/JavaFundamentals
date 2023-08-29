package com.company;

abstract class Pen{
    abstract public void write();
    abstract public void refill();
    public void general(){
        System.out.println("General");
    }
}
class FountainPen extends Pen{
    @Override
    public void write(){
        System.out.println("Writing...");
    }
    @Override
    public void refill(){
        System.out.println("Refilling...");
    }
    public void changeNib(){
        System.out.println("Changing nib...");
    }
}

class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Bite...");
    }
}
interface BasicAnimal{
    public void eat();
    public void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void speak(){
        System.out.println("Speaking");
    }
}

public class CWH_AbstractAndInterface_PS {
    public static void main(String[] args) {
//        Q1
//        Pen p = new FountainPen();
//        p.general();
//        p.refill();
//        FountainPen f = new FountainPen();
//        f.changeNib();

//        Q2
//        Human rishi = new Human();
//        rishi.sleep();

//        Q5
        Monkey m = new Human();
//        m.speak(); --> not allowed because reference is of monkey and object is of human
        m.jump();

        BasicAnimal vishal = new Human();
//        vishal.speak(); --> same reason mentioned above
    }
}
