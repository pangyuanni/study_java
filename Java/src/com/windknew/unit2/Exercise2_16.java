package com.windknew.unit2;


/*
(几何：六边形面积）编写程序，提示用户输人六边形的边长，然后显示它的面积。计算六边形
面积的公式是：：
             面积 = （3*根号3）* s的平方/2
这里的 s 就是边长。下面是一个运行示例:

Enter the side: 5.5
The area of the hexagon is 78.5918
*
* */
import java.util.Scanner;

public class Exercise2_16 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double side;
        System.out.print("Enter the side:");
        side = cin.nextDouble();
        System.out.println("The area of the hexagon is " + (Math.sqrt(3)*3/2)*side*side);


    }
}
