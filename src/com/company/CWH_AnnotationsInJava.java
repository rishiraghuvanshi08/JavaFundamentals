package com.company;

@java.lang.FunctionalInterface
interface FunctionalInterface {
    void thisMethod();
//    void thisMethod2();
}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8 pm");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class CWH_AnnotationsInJava {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5,6);
    }
}