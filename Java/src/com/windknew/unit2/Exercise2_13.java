package com.windknew.unit2;

import java.util.Scanner;

/*财务应用程序，复利值
* 假设你每月向银行账户存100元，年利率为5%，那么每月利率是
* 0。05/12 = 0.00417第一个月账户上就变成：
* 100 * (1+0.00417) = 100.417
* 第二个月之后就变成
* （100 + 100.417）* （1+0.00417） = 201.252
* 第三个月变成：
* （100 + 201.252）* （1+0.00417） = 302.507
* 依次类推编写程序显示6个月后账户上的钱数*/
public class Exercise2_13 {
    public static void main(String[] args) {
        System.out.println("Pls Enter monthly saving zmount:");
        Scanner sc = new Scanner(System. in);
        int monthly = sc.nextInt();
    }
}
