package com.windknew.unit3;

import java.util.Scanner;

/*
* (田文数字）编写一个程序，提示用户输人一个三位的整数，然后确定它是否回文数字。当从左
到右，以及从右到左都是一样的话，这个数字称为回文数。
* */
public class Exercise3_12 {
    public static void main(String[] args) {
        System.out.print("Enter a three-digit integer:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int old = num;
        if(num<0)
            num*=(-1);
        if (num>999 || num<100)
            System.out.println("输入的数据不合法,不是三位数");
        else{
            int gewei = num%10;
            int baiwei = num/100;
            if(gewei==baiwei)
                System.out.println(old+" is a palindrome.");
            else
                System.out.println(old+" is not a palindrome.");

        }


    }
}
