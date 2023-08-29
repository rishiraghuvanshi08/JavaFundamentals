package com.company;

import java.util.ArrayDeque;

public class CWH_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(34);
        ad1.add(55);
        ad1.add(78);

        ad1.addFirst(20);
        ad1.addLast(100);

        for (int element: ad1) {
            System.out.println(element);
        }
    }
}
