package com.windknew.unit3;

import java.util.Scanner;

/*
(游戏：加法测验）程序淸单 3-3 随机产生一个减法问題。修改这个程序，随机产生一个计算两
个小于 100 的整数的加法问题。

* */
public class Exercise3_10 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random()*100);
        int number2 = (int)(Math.random()*100);
        System.out.print("What is "+number1+" + "+number2+"? ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        if(number1+number2==answer)
            System.out.println("You are correct!");
        else
        {
            System.out.println("Your answer is wrong.");
            System.out.println(number1+" + "+number2+" should be "+(number1+number2));
        }

    }
}
