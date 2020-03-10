package com.windknew.unit3;

import java.util.Scanner;

/*
* (几何：点是否在矩形内？）编写程序，提示用户输入点（x,y), 然后检测该点是否在以原点（0,0)
为中心、宽为 10、 高为 5 的矩形中。例如：（2,2) 在矩形内，而（6,4) 在矩形外，如
* */
public class Exercise3_23 {
    public static void main(String[] args) {

        System.out.print("Enter a point with two coordinates: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if(x<=10/2&&x>=-10/2&&y<=5.0/2&&y>=-5.0/2)
            System.out.println("Point ("+x+", "+y+") is in the rectangle");
        else
            System.out.println("Point ("+x+", "+y+") is not in the rectangle");

    }
}
