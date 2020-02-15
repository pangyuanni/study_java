package com.windknew.unit2;


import java.util.Scanner;

/*   q求出年数  */
/* 编写程序，提示用户输入分钟数，例如十亿，然后显示这些分钟代表多少年，假设一年由365天*/
public class Exercise2_7 {
    public static void main(String[] args) {
        System.out.println("请输入分钟数：");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int day = 24*60;
        int year = day * 365;
        System.out.printf("%d min是%d年和%d天",min,min/year,(min%year)/day);
    }
}
