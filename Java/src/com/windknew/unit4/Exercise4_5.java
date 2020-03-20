package com.windknew.unit4;


import java.util.Scanner;

/*
* (几何：正 多 边 形 的 面 枳）
* */
public class Exercise4_5 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.printf("Enter the number of sides: ");
        double sides = sc.nextDouble();
        System.out.printf("Enter the side: ");
        double side = sc.nextDouble();
        double s = (sides * Math.pow(side,2))/(4*Math.tan(Math.PI/sides));
        System.out.println("The area of the polygon is "+s);
    }
}
