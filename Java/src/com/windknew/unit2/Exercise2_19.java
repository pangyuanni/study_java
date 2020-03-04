package com.windknew.unit2;
/*
* (几何:三角形的面积)编写程序，提示用户输人三角形的三个点(x1,y1)、(x2,y2) 和 (x3,y3), 然后显示它的面积。计算三角形面积的公式是:
* s=(边1+边2+边3)/2
  面积: (s * (s - 边1)(s - 边2)(s - 边3))^0.5
* */
import java.util.Scanner;

public class Exercise2_19 {
    public static void main(String[] args) {
        double x1, y1;
        double x2, y2;
        double x3, y3;
        //distance between two points
        double Length1, Length2, Length3;
        //HalfSumLengthSide represent that half of summation of all of sides
        double HalfSumLength, AreaTriangle;

        System.out.print("Enter the coordinates of three points separated"
                + " by spaces\nlike x1 y1 x2 y2 x3 y3 : ");
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextDouble(); y1 = sc.nextDouble();
        x2 = sc.nextDouble(); y2 = sc.nextDouble();
        x3 = sc.nextDouble(); y3 = sc.nextDouble();

        Length1 = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
        Length2 = Math.pow(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2), 0.5);
        Length3 = Math.pow(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2), 0.5);

        HalfSumLength = (Length1 + Length2 + Length3) / 2;
        AreaTriangle = Math.pow(HalfSumLength
                *(HalfSumLength - Length1)
                *(HalfSumLength - Length2)
                *(HalfSumLength - Length3), 0.5);
        System.out.println("The area of the triangle is " + AreaTriangle);



    }
}
