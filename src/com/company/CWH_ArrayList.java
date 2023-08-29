package com.company;

import java.util.*;

public class CWH_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        ArrayList<Integer> l3 = new ArrayList<>(5);
        l2.add(44);
        l2.add(33);
        l2.add(77);

        l1.add(3);
        l1.add(7);
        l1.add(0);
        l1.add(0,0);
        l1.add(0,1);
        l1.addAll(l2);
//        l1.clear(); --> Clear the arraylist
//        System.out.println(l1.contains(23));
        System.out.println(l1.indexOf(0));
        System.out.println(l1.lastIndexOf(0));
        l1.set(1,333);

//        l1.addAll(0,l2); //--> add elements from 0 index, (1,l2) will add elements from 1 index
//        Using For Each loop
//        for (int element: l1) {
//            System.out.println(element);
//        }
        for (int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
//        for (int i = 0; i < l2.size(); i++){
//            System.out.println(l2.get(i));
//        }

    }
}
