package com.windknew.unit3;

import java.util.Scanner;

/*
* (科学：风寒a度）编程练习题 2.17 给出计算风寒温度的公式。这个公式适用于温度在华氏
-58。 到 41° 之间，并且风速大于或等于 2 的情况。编写一个程序，提示用户输人一个温度值和一个
风速值。如果输人值是合法的，那么显示风寒温度，否则显示一条消息，表明温度或风速是不
合法数值
*
* */
public class Exercise3_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double t = sc.nextDouble();
        System.out.print("Enter the velocity: ");
        double v = sc.nextDouble();
        double twc = 35.74+0.6215*t-35.75*Math.pow(v,0.16)+0.4275*t*Math.pow(v,0.16);
        if(t>=-58&&t<=41&v>=2)
            System.out.println("The twc is "+twc);
        else
            System.out.println("Invalid input.");

    }
}
