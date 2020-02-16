package com.windknew.unit2;


import javax.swing.*;
import java.util.Scanner;

/* 当前时间*/
/* */
public class Exercise2_8 {
    public static void main(String[] args) {
        gmt(0);
        System.out.println("Enter the time zone offset to GMT:");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        gmt(s);

    }
    public   static  void gmt(int t){
        long totalMilliseconds = System.currentTimeMillis() - t ;
        //System.out.println(totalMilliseconds/1000);
        long totalSeconds = totalMilliseconds/1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds/60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes/60;
        long currentHour = totalHours % 24;
        System.out.println("Current time is "+currentHour + ":"+currentMinute + ":" + currentSecond + " GMT");
    }
}
