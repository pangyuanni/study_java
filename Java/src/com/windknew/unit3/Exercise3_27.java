package com.windknew.unit3;

import java.util.Scanner;

/*
* (几何：点是否在三角形内？）假设一个直角三角形放在一个平面上，如下图所示。直角点在（0, 0) 处，
* 其他两个点分别在（ 200, 0 ) 和（ 0, 100 ) 处。编写程序，提示用户输人一个点的；c 坐
标和7坐标，然后判定这个点是否在该三角形内。下面是运行示例：
* */
public class Exercise3_27 {
    public static void main(String[] args) {
        System.out.print("Enter a point's x- and y- coordinates: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if(x>=0&&x<=200&&y>=0&&y<=100-0.5*x)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");

    }
}
