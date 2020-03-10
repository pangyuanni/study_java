package com.windknew.unit3;

import java.util.Scanner;

/*
*科学：某天是星期几）泽勒一致性是由克里斯汀 泽勒开发的用于计算某天是星期几的算法。(公式打不出来，百度就好)
*注意，公式中的除法执行一个整数相除。编写程序，提示用户输入年、月和该月的哪一天，
然后显示它是一周中的星期几。下面是一些运行示例：
*
* */
public class Exercise3_21 {
    public static void main(String[] args) {
        int[] mdays = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: (e,g.,2012):");
        int year = sc.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = sc.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0))
            mdays[1]=29;
        System.out.print("Enter the day of the month: 1-"+mdays[month-1]+": ");
        int q = sc.nextInt();
        if(month==1||month==2){
            month+=12;
            year--;
        }
        int h=(q+26*(month+1)/10+year%100+year%100/4+year/100/4+5*(year/100))%7;
        String[] days = {"Sat","Sun","Mon","Tue","Wed","Thu","Fri"};
        System.out.println("Day of the week is "+days[h]);
    }
}
