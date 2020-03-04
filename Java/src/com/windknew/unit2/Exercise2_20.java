package com.windknew.unit2;

import java.util.Scanner;

/*
* (财务应用程序:计算利息)如果知道收支余额和年利率的百分比，就可以使用下面的公式计算下个月要支付的利息额:
* 利息额 = 收支余额 x (年利率 / 1200)，
* 编写程序，读取收支余额和年百分利率，显示两个版本的下月利息。

* */
public class Exercise2_20 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter balance and interest rate (e.g., 3 for 3X):");
            double balance = in.nextDouble();
            double rate = in.nextDouble();
            System.out.println("The interest is " + balance * (rate / 1200));


    }
}
