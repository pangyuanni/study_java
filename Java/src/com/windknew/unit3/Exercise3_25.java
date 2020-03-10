package com.windknew.unit3;

import java.util.Scanner;

/*
*(几何：交点）第一条直线上面的两个点是（xl,yl) 和（x2,y2 ), 第二条直线的两个点是（x3,y3) 和（x4,y4 ),
* 如图 3-8a、图 3-8b 所示。两条直线的交点可以通过下面的线性方程组求解：
*  (y1-y2)x-(x1-x2)y = (y1-y2)x1-(x1-x2)y1
*  (y3-y4)x-(x3-x4)y = (y3-y4)x3-(x3-x4)y3
*
* */
public class Exercise3_25 {
    public static void main(String[] args) {
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        double a = y1-y2;
        double b = x2-x1;
        double c = y3-y4;
        double d = x4-x3;
        double e = (y1-y2)*x1-(x1-x2)*y1;
        double f = (y3-y4)*x3-(x3-x4)*y3;
        double jb = a*d-b*c;
        if(jb==0)
            System.out.println("The two lines are parallel");
        else
            System.out.println("The intersecting point is at ("+(e*d-b*f)/jb+", "+(a*f-e*c)/jb+")");


    }
}
