package com.windknew.unit2;

import java.util.Scanner;

/*
* (财务应用：计算未来投资值）编写程序，读取投资总额、年利率和年数，
* 然后使用下面的公式显示未来投资金顛：未来投资金额 = 投资总额 X ( 1 + 月利率）^年数*12，
* 例如：如果输入的投资金额为 1000, 年利率为 3.25%, 年数为1, 那么未来投资额为 1032.98。


* */
public class Exercise2_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double amount = in.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double rate = in.nextDouble() / 100 /12 ; // 月利率 = 年利率 / 12
        System.out.print("Enter number of years: ");
        double years = in.nextDouble();
        double total = amount * Math.pow(1 + rate, years*12);

        System.out.println("Accumulated value is $" + total);

    }
}
