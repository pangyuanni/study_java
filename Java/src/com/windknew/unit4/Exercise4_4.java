package com.windknew.unit4;

import java.util.Scanner;
/*
*
* (几何：六边形面积）
* */
public class Exercise4_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side:");
        double s=sc.nextDouble();
        double area=(6*Math.pow(s, 2))/(4*Math.tan(Math.PI/6));

        System.out.printf("The area of the pentagon is%4.2f ",area);

    }
}
