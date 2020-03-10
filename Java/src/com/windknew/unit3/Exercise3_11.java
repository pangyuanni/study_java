package com.windknew.unit3;

import java.util.Scanner;

/*
* (给出一个月的总天教）编写程序，提示用户输入月份和年份，然后显示这个月的天数。例如：
如果用户输人的月份是 2 而年份是 2012, 那么程序应该显示 “ February 2012 has 29 days"( 2012
年 2 月有 29 天〉。如果用户输人的月份为 3 而年份为 2015, 那么程序就应该显示 “ March 2015
has 31 days”（2015 年 3 月有 31 天)。
*
*
* */
public class Exercise3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month = sc.nextInt();
        System.out.print("Enter the year number: ");
        int year = sc.nextInt();
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        String[] monthNames={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        boolean isLeapYear = (year%4==0&&year%100!=0)||(year%400==0);
        if(isLeapYear)
            months[1]=29;
        System.out.println(monthNames[month-1]+" "+year+" has "+months[month-1]+" days.");


    }
}
