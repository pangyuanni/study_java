package com.windknew.unit3;

import java.util.Scanner;

/*
* (几何：两个矩形）编写一个程序，提示用户输入两个矩形中点的 x 坐标和:v 坐标以及它们的宽
度和高度，然后判定第二个矩形是在第一个矩形内，还是和第一个矩形重叠，如图 3-9 所示
* */
public class Exercise3_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double w1 = sc.nextDouble();
        double h1 = sc.nextDouble();
        System.out.print("Enter r2's center x-, y0coordinates, width, and height: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double w2 = sc.nextDouble();
        double h2 = sc.nextDouble();
        if((x1+w1/2>=x2+w2/2)&&(x1-w1/2<=x2-w2/2)&&(y1+h1/2>=y2+h2/2)&&(y1-h1/2<=y2-h2/2))
            System.out.println("r2 is inside r1");
        else if((x2-w2/2>x1+w1/2)||(x2+w2/2<x1-w1/2)||(y2-h2/2>y1+h1/2)||(y2+h2/2<y1-h1/2))
            System.out.println("r2 does not overlap r1");
        else if((x2+w2/2>=x1+w1/2)&&(x2-w2/2<=x1-w1/2)&&(y2+h2/2>=y1+h1/2)&&(y2-h2/2<=y1-h1/2))
            System.out.println("r1 is inside r2");
        else
            System.out.println("r2 overlaps r1");

    }


}
