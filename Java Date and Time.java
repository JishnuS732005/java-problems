#  https://www.hackerrank.com/challenges/java-date-and-time/

import java.io.*;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

class Result {
    public static String findDay(int month, int day, int year) {
        LocalDate date=LocalDate.of(year,month,day);
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.ENGLISH).toUpperCase();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int day=sc.nextInt();
        int year=sc.nextInt();
        
        String res=Result.findDay(month,day,year);
        System.out.println(res);
    }
}
