package com.windknew.unit3;

import java.util.Scanner;

/*
*(游戏：三个數的加法）程序清单 3- 1 中的程序产生两个整数. 并提示用户输人这两个整数的和。
修改该程序使之能产生三个一位整数. 然后提示用户输入这三个整数的和。
 */
public class Exercise3_2 {
    public static void main(String[] args) {
        int numberl = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);
        int number3 = (int) (System.currentTimeMillis() / 5 % 10);
        System.out.println(numberl);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println("What is" + numberl + "+" + number2 + "+" + number3 + " ?");
        Scanner sc = new Scanner(System.in);
        int number4 = sc.nextInt();
        boolean flag = false;
        if (number4 == numberl + number2 + number3)
            flag = true;
        System.out.println(numberl + "+" + number2 + "+" + number3 + "=" + number4 +" is "+ flag);

    }
}