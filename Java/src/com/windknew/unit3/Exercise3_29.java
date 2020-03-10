package com.windknew.unit3;

import java.util.Scanner;

/*
* (几何：两个圆）编写程序，提示用户输人两个圆的中心坐标和各自的半径值，然后决定第二个
圆是在第一个圆内，还是和第一个岡重叠，如图 3-10 所示。
* */
public class Exercise3_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle's center x-, y-coordinates, and radius: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r1 = sc.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double r2 = sc.nextDouble();
        if(Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5)<=Math.abs(r1-r2))
            System.out.println("circle2 is inside circle1");
        else if(Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5)<=r1+r2)
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");

    }
}
