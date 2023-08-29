package com.company;

public class CWH_Methods_PracticeSet {
//    static void pattern(int x){
//        for(int i = x; i > 0; i--){
//            for(int j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
//    static int sum(int x){
//        if(x == 1){
//            return 1;
//        }
//        else{
//            return x + sum(x-1);
//        }
//    }
//    static int avg(int x, int ...arr){
//        int sum = 0;
//        for (int element: arr) {
//            sum += element;
//        }
//        int average = sum / x;
//        return average;
//    }
//    static void pattern2(){
//        System.out.println("*");
//    }
//    static int fib(int x){
//        if(x == 1){
//            return 0;
//        }
//        else if(x == 2){
//            return 1;
//        }
//        else{
//            return fib(x-1) + fib(x-2);
//        }
//    }
//    static void pattern_rec(int x){
//        if(x > 0){
//            pattern_rec(x-1);
//            for(int i = 0; i < x; i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    static void pattern_rec2(int x){
        if(x > 0){
            pattern_rec2(x-1);
            for(int i = x; i <= 5; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        pattern(6);
//        System.out.println(sum(10));
//        System.out.println(avg(5, 3,4,5,6,7));
//        System.out.println(fib(4));
//        pattern_rec(3);
        pattern_rec2(5);
    }
}
