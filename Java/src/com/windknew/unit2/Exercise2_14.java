package com.windknew.unit2;

import java.util.Scanner;

/*
* (医疗应用程序：计算 BMI ) 身体质量指数（ BMI ) 是对体重的健康测量。它的值可以通过将体
重（以公斤为单位）除以身高（以米为单位）的平方值得到。编写程序，提示用户输人体重（以
磅为单位）以及身髙（以英寸为单位)，然后显示 BMI。注意：一磅是 0.45359237公斤，一英
寸是 0.0254 米。下面是一个运行示例：
*Enter weight in pounds: 95.5
Enter height in inches: 5O
BMI is 26.8573
* */
public class Exercise2_14 {
    public static void main(String[] args) {
//        System.out.println("Enter weight in pounds: ");
//        Scanner sc = new Scanner(System.in);
//        double weight = sc.nextDouble();
//        weight = weight* 0.45359237;
//        System.out.println("Enter height in inches: ");
//        double height = sc.nextDouble();
//        height = height * 0.0254;
//        System.out.println("BMI is :" + (weight/height)*(weight/height));
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter weight in pounds:");
                double weight=sc.nextDouble();
                System.out.print("Enter height in inches:");
                double height=sc.nextDouble();
                float BMI =(float) ((weight*0.45359237)/(Math.pow((height*0.0254), 2)));
                System.out.print("BMI is "+BMI);
            }


    }

