package com.windknew.unit3;

import java.util.Scanner;

/*
* 提示用户输入代表今天日期的数字（周日为0 ，周一为1，….，周六为6）。同时，提示用户输入一个今天之后的天数，作为代表将来某天的数字，然后显示这天是星期几。
* */
public class Exercise3_5   {
    public static void main(String[] args) {
        Scanner sc  = new java.util.Scanner(System.in);

        System.out.print("Enter today's day : ");
        int today =sc.nextInt();



        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedSinceToday = sc.nextInt();

        int theFutureDay = ( today + elapsedSinceToday ) % 7;

        switch(today)
        {
            case 0 : System.out.print("Today is Sunday and the future day is ");break;
            case 1 : System.out.print("Today is Monday and the future day is ");break;
            case 2 : System.out.print("Today is Tuesday and the future day is ");break;
            case 3 : System.out.print("Today is Wednesday and the future day is ");break;
            case 4 : System.out.print("Today is Thursday  and the future day is ");break;
            case 5 : System.out.print("Today is Friday and the future day is ");break;
            case 6 : System.out.print("Today is Saturday and the future day is ");break;

        }

        switch(theFutureDay)
        {
            case 0:System.out.println("Sunday");break;
            case 1:System.out.println("Monday");break;
            case 2:System.out.println("Tuesday");break;
            case 3:System.out.println("Wednesday");break;
            case 4:System.out.println("Thursday");break;
            case 5:System.out.println("Friday");break;
            case 6:System.out.println("Saturday");break;
        }






    }
}
