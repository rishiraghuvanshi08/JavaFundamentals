package com.company;

import java.util.HashSet;

public class CWH_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(43);
        myHashSet.add(76);
        myHashSet.add(45);
        myHashSet.add(14);
        myHashSet.add(76);
        System.out.println(myHashSet);

    }
}
