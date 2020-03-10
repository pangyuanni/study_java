package com.windknew.unit3;

import java.util.Scanner;

/*
* (代教：求解 2 x 2 线性方程）可以使用编程练习题丨丨.3 中给出的 Cramer 规则解线性方程组
* ax + by = e
* cx + dy = f
* x = (ed -bf) / (ad - bc)
* y = (af -ec) / (ad — bc)
*
*
* 编 写 程 序，提 示 用 户 输 人 a,b,c,d,e,f/, 然 后 显 示 结 果。如 果 ad - bc  =0报告消息 “ The
equation has no solution ”（方程式无解）。
* */
public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c,d,e,f:");
        double a =sc.nextDouble();
        double b =sc.nextDouble();
        double c =sc.nextDouble();
        double d =sc.nextDouble();
        double e =sc.nextDouble();
        double f =sc.nextDouble();
        if (a*d-b*c==0){
            System.out.println("The equation has no solution");
        }
        else{
            double x = (e*d -b*f) / (a*d - b*c);
            double y = (a*f -e*c) / (a*d - b*c);
            System.out.println("x is "+ x+"y is "+ y);
        }
    }
}
