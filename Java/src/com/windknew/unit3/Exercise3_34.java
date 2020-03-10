package com.windknew.unit3;

import java.util.Scanner;

/*
* (几何：线段上的点）编程练习题 3.32 显示了如何测试一个点是否在一个无限长的直线上。修改
编程练习题 3.32, 测试一个点是否在一个线段上。编写一个程序，提示用户输入三个点 P0、pi
和 p2, 显 示 p2 是否在从 p0 到 pi的线段上。这里是一些运行示例：
* */
public class Exercise3_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = sc.nextDouble();
        double y0 = sc.nextDouble();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        if((x1-x0)*(y2-y0)-(x2-x0)*(y1-y0)==0&&x2>=x0&&x2<=x1)
            System.out.println("("+x2+", "+y2+") is on the line segment from ("+x0+", "+y0+") to ("+x1+", "+y1+")");
        else
            System.out.println("("+x2+", "+y2+") is not on the line segment from ("+x0+", "+y0+") to ("+x1+", "+y1+")");

    }
}
