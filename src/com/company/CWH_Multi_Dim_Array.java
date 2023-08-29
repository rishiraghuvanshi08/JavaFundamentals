package com.company;

public class CWH_Multi_Dim_Array {
    public static void main(String[] args) {
        int [][] arr = new int[2][3];
        arr[0][0] = 111;
        arr[0][1] = 222;
        arr[0][2] = 333;
        arr[1][0] = 444;
        arr[1][1] = 555;
        arr[1][2] = 666;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
