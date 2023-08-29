package com.company;

import java.util.Scanner;

public class CWH_Practice_Set_Array {
    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        for (int j = 0; j < arr.length; j++){
            System.out.printf("Enter arr[%d] : ", j);
            arr[j] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];;
        }
        System.out.println(sum);


        int [] arr = {23, 15, 62, 32, 65};
        int temp;
        for(int i = 0, j = arr.length-1; i < arr.length/2; i++, j--){
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for (int element: arr) {
            System.out.println(element);
        }


        int [] arr = {1, 92, 4, 5, 3};
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (temp < arr[j]) {
                    temp = arr[j];
                }
            }
        }
        System.out.println("Highest value of array is " + temp);


        int [] arr = {23, 54, 36, 75, 15};
        int max = Integer.MAX_VALUE;
        for (int e:
             arr) {
            if(e < max){
                max = e;
            }
        }
        System.out.println(max);


        int [] arr = {23, 15, 62, 32, 65};
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int element: arr) {
            System.out.print(element+ " ");
        }

         */
        boolean isSorted = true;
        int [] arr = {23, 15, 62, 32, 65};
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
