package com.windknew.unit3;

import java.util.Scanner;

/*
*
*(几柯：点是否在圓内？）编写程序，提示用户输人一个点（x, y),然后检査这个点是否在以原
点（0, 0) 为圆心、半径为 10 的圆内。例如：（4, S)是圆内的一点，而（9, 9) 是圆外的一点，
如图 3-7a 所示。
* */
public class Exercise3_22 {
    public static void main(String[] args) {
        System.out.print("Enter a point with two coordinates: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if(x*x+y*y>100)
            System.out.println("Point ("+x+", "+y+") is not in the circle");
        else
            System.out.println("Point ("+x+", "+y+") is in the circle");

    }
}
