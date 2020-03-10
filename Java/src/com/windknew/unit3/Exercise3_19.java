package com.windknew.unit3;

import java.util.Scanner;

/*
* (计算三角形的周长）编写程序，读取三角形的三条边，如果输人值合法就计算这个三角形的周
长；否则，显示这些输入值不合法。如果任意两条边的和大于第三边，那么输人值都是合法的
* */
public class Exercise3_19 {
    public static void main(String[] args) {
        System.out.print("Enter the three lengths:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double cir = a+b+c;
        if((2*a>=cir)||(2*b>=cir)||(2*c>=cir))
            System.out.println("Invalid input");
        else
            System.out.println("The circumference is "+cir);

    }
}
