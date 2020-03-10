package com.windknew.unit3;

import java.util.Scanner;

/*
* ( 当前时间）修改编程练习题 H 以 12 小时时钟制显示小时数。这里是一个运行示例
* */
public class Exercise3_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT:");
        long offset = sc.nextLong();
        long totalMilliseconds = System.currentTimeMillis();
        totalMilliseconds+=offset*60*60*1000;
        long totalSeconds = totalMilliseconds/1000;
        long currentSecond = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinute = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHour = totalHours%24;
        String tail = "AM";
        if(currentHour>12)
        {
            currentHour-=12;
            tail="PM";
        }
        System.out.println("Current time is "+currentHour+":"+currentMinute+":"+currentSecond+" "+tail);
    }
}
