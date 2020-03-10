package com.windknew.unit3;


import java.util.Scanner;

/*
* (代数：解一元二次方程）可 以 使 用 下 面 的 公 式 求 一 元 二 次 方 程 的 两 个 根：
b的平方-4ac称作一元二次方程的判别式。如果它是正值，那么一元二次方程就有两个实数根。如
果它为 0, 方程式就只有一个根。如果它是负值，方程式无实根。
编写程序，提示用户输入 fl、6 和 c的值，并且显示基于判别式的结果。如果这个判别式为
正，显示两个根。如果判别式为 0, 显示一个根。否则，显示 “ The equation has no real roots”（该
方程式无实数根）。
*
*
* */
public class Exercise3_1 {
    public static void main(String[] args) {
        double a ,b,c,d,r1,r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = b * b - 4 * a * c;
        if (d > 0 ){
            d = Math.pow(d,0.5);
            r2 = -b +d;
            r2 = r2 /(2*a);
            r1 = -b -d;
            r1 = r1 /(2*a);
            System.out.println(d);
            System.out.println("The equation has two roots :"+r1+","+r2);
        }
        else if (d == 0){
            d = Math.pow(d,0.5);
            r1 = -b /(2*a);
            System.out.println("The equation has one root"+r1);
        }
        else if (d < 0){
            System.out.println("The equation has no real roots");
        }
    }
}