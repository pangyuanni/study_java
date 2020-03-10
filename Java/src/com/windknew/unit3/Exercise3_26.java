package com.windknew.unit3;

import java.util.Scanner;

/*
* 使用操作符 && 、丨丨和 M 编写一个程序，提示用户输入一个整数值，然后判定它是否能被 5 和 6 整除，是否能被 5 或 6 整除，以及是否能被 5 或 6 整除但是不能同时被它们整除3 下面是这个
程序的运行示例：
* */
public class Exercise3_26 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Is "+n+" divisible by 5 and 6? "+(n%5==0&&n%6==0));
        System.out.println("Is "+n+" divisible by 5 or 6? "+(n%5==0||n%6==0));
        System.out.println("Is "+n+" divisible by 5 or 6, but not both? "+(n%5==0^n%6==0));

    }
}
