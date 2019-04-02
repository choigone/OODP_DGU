package com.top;

import java.util.GregorianCalendar;


public class Main {

    public static void main(String[] args) {

        BasicFormat basicFormat = new BasicFormat();
        /* Tests */
        System.out.println("Date: " + basicFormat.formatDate(new GregorianCalendar(2005, 5,24).getTime()));
        System.out.println("Date: " + basicFormat.formatDate(2011, 6,25));
        System.out.println("Integer: " +  basicFormat.formatLong(1234567) );
        System.out.println("Integer: " +  basicFormat.formatLong(68));
        System.out.println("Money: " +  basicFormat.formatMoney(9812345.678) );
        System.out.println("Money: " +  basicFormat.formatMoney(9812345) );
        System.out.println("Money: " +  basicFormat.formatMoney(.78) );
        System.out.println("Person: " + basicFormat.formatPerson("Weinman","Jerod","weinman"));
    }
}
