package com.company;

@java.lang.FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    void meth2();
}

//class HarryFunc implements DemoAno{
//
//    @Override
//    public void meth1() {
//        System.out.println("Method 1 printing by traditional method");
//    }
//}

//class AnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//    }
//}

public class CWH_Lambda {
    public static void main(String[] args) {
//        DemoAno obj = new AnonyDemo();
//        obj.meth1();

//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();

        // Lambda Expression

        // By Traditional
//        HarryFunc obj = new HarryFunc();
//        obj.meth1();

        // By Lambda Expression
        DemoAno obj = (a)->{
            System.out.println("Method 1 by lambda expression, argument is " + a);
        };
        obj.meth1(69);
    }
}
