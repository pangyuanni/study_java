package com.windknew.unit3;

import java.util.Scanner;

/*
* (游戏：猜硬币的正反面）编写程序，让用户猜一猜是硬币的正面还是反面。这个程序随机产生
一个整数 0或者1, 它们分别表示硬币的正面和反面。程序提示用户输人一个猜测值，然后报
告这个猜测值是正确的还是错误的。
* */
public class Exercise3_14 {
    public static void main(String[] args) {
        int coin = (int)(Math.random()*2);
        System.out.print("Guess: ");
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        if(g==coin)
            System.out.println("You are right, coin is "+coin);
        else
            System.out.println("You are wrong, coin is "+coin);

}

}
