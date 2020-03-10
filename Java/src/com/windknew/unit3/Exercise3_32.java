package com.windknew.unit3;

import java.util.Scanner;

/*
(几何：点的位置）给定一个从点 pO(xO,yO)到 pl(xl，pl)的有向线段，可以使用下面的条件来确
定点 p2(x2,y2)是在线段的左侧 、 右侧，或者在该直线上（)
                                                 >0 p2 在线段左侧
(xl-xO ) x (y2 - yO )-( x2 - xO ) x {y1 -yO )    <0 p2 在线段右侧
                                                 =0 p2 在线段上
*

编写一个程序，提示用户输人三个点 p0、pi和 p2, 显 示 p2 是否在从 p0 到 pi的线段左侧、
右侧，或者在该直线上。下面是运行示例：*/
public class Exercise3_32 {
    public static void main(String[] args) {
        System.out.print("Enter three points for p0, p1, and p2: ");
        Scanner sc = new Scanner(System.in);
        double x0 = sc.nextDouble();
        double y0 = sc.nextDouble();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double result = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
        if(result>0)
            System.out.println("("+x2+","+y2+")"+" is on the left side of the line from"+"("+x0+","+y0+")"+"to"+"("+x1+","+y1+")");
        else if(result==0)
            System.out.println("("+x2+","+y2+")"+" is on the line from"+"("+x0+","+y0+")"+"to"+"("+x1+","+y1+")");
        else
            System.out.println("("+x2+","+y2+")"+" is on the right side of the line from"+"("+x0+","+y0+")"+"to"+"("+x1+","+y1+")");

    }
}
