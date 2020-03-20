package com.windknew.unit4;

import java.util.Scanner;

/* (几何：最大国距离 ）最大圆距离是指球面上两个点之间的距离*/
public class Exercise4_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter point 1(latitude and longitude) in degress ");
        String s1=sc.nextLine();
        System.out.print("Enter point 2(latitude and longitude) in degress ");
        String s2=sc.nextLine();
        double x1=Double.parseDouble(s1.split(",")[0]);
        double y1=Double.parseDouble(s1.split(",")[1]);
        double x2=Double.parseDouble(s2.split(",")[0]);
        double y2=Double.parseDouble(s2.split(",")[1]);
        final double   r=6371.01;
        double result=r*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2)));
        System.out.println("The distance between the two points is "+result+"km");

    }
}
