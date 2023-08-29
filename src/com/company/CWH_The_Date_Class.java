package com.company;

import java.util.Calendar;
import java.util.Date;

public class CWH_The_Date_Class {
    public static void main(String[] args) {
//        Date d = new Date(3, Calendar.NOVEMBER,8);
//        System.out.println(d);
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());

    }
}
