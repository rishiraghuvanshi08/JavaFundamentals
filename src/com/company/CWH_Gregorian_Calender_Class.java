package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CWH_Gregorian_Calender_Class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + " : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2020));

        System.out.println(TimeZone.getAvailableIDs()[494]);
        System.out.println(TimeZone.getAvailableIDs()[495]);
        System.out.println(TimeZone.getAvailableIDs()[496]);
        System.out.println(TimeZone.getAvailableIDs()[497]);
        System.out.println(TimeZone.getAvailableIDs()[498]);
        System.out.println(TimeZone.getAvailableIDs()[499]);
        System.out.println(TimeZone.getAvailableIDs()[500]);
        System.out.println(TimeZone.getAvailableIDs()[501]);
        System.out.println(TimeZone.getAvailableIDs()[502]);
        System.out.println(TimeZone.getAvailableIDs()[503]);
        System.out.println(TimeZone.getAvailableIDs()[504]);
        System.out.println(TimeZone.getDefault());
    }
}
