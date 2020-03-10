package com.windknew.unit3;

import java.util.Scanner;

/*
(金融：比较成本）假设你要通过两种不同的包裹运输大米。你将乐于编写一个程序来比较成本，
该程序提示用户输入每个包裹的重童和价格，然后显示具有更好价格的包裹。下面是一个运行

* */
public class Exercise3_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double w1 = sc.nextDouble();
        double p1 = sc.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double w2 = sc.nextDouble();
        double p2 = sc.nextDouble();
        double av1 = p1/w1;
        double av2 = p2/w2;
        if(av1<av2)
            System.out.println("Package 1 has a better price.");
        else if(av1==av2)
            System.out.println("Two packages have the same price.");
        else
            System.out.println("Package 2 has a better price.");

    }
}
