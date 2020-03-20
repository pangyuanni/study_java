package com.windknew.unit4;

import java.util.Scanner;

/*(几何：五边形的面枳）编写程序，提示用户输人从五边形中心到顶点的距离，计算五边形的面积*/
public class Exercise4_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the lenght from the center to a vertex:");
        double r=input.nextDouble();
        double s=2*r*Math.sin(Math.PI/5);
        double area=(5*Math.pow(s, 2))/(4*Math.tan(Math.PI/5));
        System.out.printf("The area of the pentagon is %4.2f ",area);

    }
}
