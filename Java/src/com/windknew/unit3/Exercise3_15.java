package com.windknew.unit3;

import java.util.Scanner;
/*
* (游戏：彩票）修改程序清单 3-8,产生三位整数的彩票。
* 程序提示用户输入一个三位整数，然后依照下面的规则判定用户是否贏得奖金：
*  1 ) 如果用户输人的所有数匹配彩票的确切顺序，奖金是丨0 000 美元。
*  2 ) 如果用户输人的所有数匹配彩票的所有数字，奖金是 3 000 美元。
*  3 )如果用户输人的其中一个数匹配彩票号码中的一个数，奖金是 1 000 美元
*
* */
public class Exercise3_15 {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 1000);
        int ld1 = lottery % 10;
        int ld2 = lottery / 10 % 10;
        int ld3 = lottery / 100 % 10;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your pick: ");
        int guess = sc.nextInt();
        int g1 = guess % 10;
        int g2 = guess / 10 % 10;
        int g3 = guess / 100 % 10;
        System.out.println("The lottery number is " + lottery);
        if (guess == lottery)
            System.out.println("you win $10,000");
        else if ((g1 == ld1 && g2 == ld3 && g3 == ld2) || (g1 == ld2 && g2 == ld1 && g3 == ld3) || (g1 == ld2 && g2 == ld3 && g3 == ld1) || (g1 == ld3 && g2 == ld1 && g3 == ld2) || (g1 == ld3 && g2 == ld2 && g3 == ld1))
            System.out.println("you win $3000");
        else if (g1 == ld1 || g1 == ld2 || g1 == ld3 || g2 == ld1 || g2 == ld2 || g2 == ld3 || g3 == ld1 || g3 == ld2 || g3 == ld3)
            System.out.println("you win $1000");
        else
            System.out.println("bad luck!");
    }
}
