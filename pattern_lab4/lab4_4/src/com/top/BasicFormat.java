package com.top;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class BasicFormat {
    public static String formatDate(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
        return dateFormat.format(new GregorianCalendar(date.getYear() + 1900, date.getMonth() - 1,date.getDate()).getTime());
    }

    public static String formatDate(int year,int month, int day){
        month--;
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
        return dateFormat.format(new GregorianCalendar(year, month, day).getTime());
    }

    public static String formatLong(long number){
        DecimalFormat intFormat = new DecimalFormat("#,###");
        return intFormat.format(number);
    }

    public static String formatMoney(double amount){
        DecimalFormat dollarFormat = new DecimalFormat("$ #,##0.##");
        return dollarFormat.format(amount);
    }
    public static String formatPerson(String firstName, String lastName, String userName){
        MessageFormat personFormat = new MessageFormat("{0}, {1} [{2}]");
        return personFormat.format(new Object[] {firstName, lastName,userName});
    }
}
