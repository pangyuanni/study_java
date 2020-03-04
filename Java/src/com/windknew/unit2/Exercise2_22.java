package com.windknew.unit2;

import java.util.Scanner;

/*
* ( 财务应用：货币单位）改写程序淸单 2-10, 解决将 double 型值转换为 int 型值时可能会造成精度损失的问题。
* 输入的输入值是一个整数，其最后两位代表的是美分币值。例如：1156 就表示的是 11美元 S6 美分。
* */
public class Exercise2_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount, for example, 1156: ");
        int amount = sc.nextInt();
        int Dollars = amount / 100;
        amount = amount % 100;
        int Quarters = amount / 25;
        amount = amount % 25 ;
        int Dimes = amount  / 10 ;
        amount = amount % 10 ;
        int Nickels = amount / 5 ;
        amount = amount % 5;
        int Pennies = amount ;
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + Dollars + " dollars");
        System.out.println(" " + Quarters + " quarters");
        System.out.println(" " + Dimes + " dimes");
        System.out.println(" " + Pennies + " pennies");




    }
}
