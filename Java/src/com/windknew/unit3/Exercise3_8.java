package com.windknew.unit3;

import java.util.Scanner;

/*

(对三个整數排序）编写程序，提示用户输入三个整数。以非降序的形式显示这三个整数。
* */
public class Exercise3_8 {
    public static void main(String[] args) {
        System.out.print("Input 3 integers:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1>num2)
        {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        if(num2>num3)
        {
            int tmp = num2;
            num2 = num3;
            num3 = tmp;
        }
        if(num1>num2)
        {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        System.out.println(num1+" "+num2+" "+num3);


    }
}
