package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class CWH_Advance_Java_PracticeSet {
    public static void main(String[] args) {
//        Question 1
//        ArrayList<String> studentNames = new ArrayList<>();
//        studentNames.add("Rishi");
//        studentNames.add("Roman");
//        studentNames.add("Rohan");
//        studentNames.add("Ronnie");
//        studentNames.add("Rohit");
//
//        for (String element: studentNames) {
//            System.out.println(element);
//        }

//        Question 4 --> Using DateTimeFormatter (Java.Time API)
//        LocalDateTime d = LocalDateTime.now();
//        System.out.println(d);
//
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("k : m : s");
//        String myTime = d.format(df);
//        System.out.println(myTime);

//        Question 2 --> Using Date Class
//        Date d = new Date();
//        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

//       Question 3 Using Calender Class -->
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

//        Question 5 -->
//        HashSet<Integer> set = new HashSet();
//        set.add(45);
//        set.add(41);
//        set.add(15);
//        set.add(45);
//        set.add(35);
//        System.out.println(set);


    }
}
