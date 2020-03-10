package com.windknew.unit3;
/*
* ( 财务应用程序：整钱兑零）修改程序淸单 2-
10, 使之只显示非零的币值单位，用单词的单数形
式显示一个单位，例如 1 dollar and 1 penny ( 1 美元和丨美分）；用单词的复数形式显示多于一个
单位的值，例如 2 dollars and 3 pennies ( 2 美元和 3 美分）。
* */
import java.util.Scanner;

public class Exercise3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 114.514:");
        double amount = sc.nextDouble();
        int remainAmount = (int)(amount*100);
        int numberOfDollars = remainAmount/100;
        remainAmount%=100;
        int numberOfQuarters = remainAmount/25;
        remainAmount%=25;
        int numberOfDimes = remainAmount/10;
        remainAmount%=10;
        int numberOfNickels = remainAmount/5;
        remainAmount%=5;
        int numberOfPennies = remainAmount;
        System.out.println("Your amount "+amount+" consists of");
        if(numberOfDollars>0)
        {
            System.out.print(numberOfDollars);
            if(numberOfDollars>1)
                System.out.println(" dollars");
            else
                System.out.println(" dollar");
        }
        if(numberOfQuarters>0)
        {
            System.out.print(numberOfQuarters);
            if(numberOfQuarters>1)
                System.out.println(" quarters");
            else
                System.out.println(" quarter");
        }
        if(numberOfDimes>0)
        {
            System.out.print(numberOfDimes);
            if(numberOfDimes>1)
                System.out.println(" dimes");
            else
                System.out.println(" dime");
        }
        if(numberOfNickels>0)
        {
            System.out.print(numberOfNickels);
            if(numberOfNickels>1)
                System.out.println(" nickels");
            else
                System.out.println(" nickel");
        }
        if(numberOfPennies>0)
        {
            System.out.print(numberOfPennies);
            if(numberOfPennies>1)
                System.out.println(" pennies");
            else
                System.out.println(" penny");
        }

    }
}
