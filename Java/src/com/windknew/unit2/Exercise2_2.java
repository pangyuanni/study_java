package com.windknew.unit2;


/*  编写程序，读入圆柱的半径和高，用下列公式计算圆柱的体积*/

/*  面积 = 半径 * 半径 * PI  */

/*  体积 = 面积 * 高  */

import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入圆柱的半径：");
        double r = sc.nextDouble();
        System.out.print("请输入圆柱的高：");
        double h = sc.nextDouble();
        double s = r*r*Math.PI;
        System.out.printf("圆柱的面积是%f\n",s );
        double v = s * h;
        System.out.printf("圆柱的体积是%f",v);
    }
}
