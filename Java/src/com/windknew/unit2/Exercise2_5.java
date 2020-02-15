package com.windknew.unit2;

/*财务应用程序，计算小费*/

import java.util.Scanner;

/*编写一个程序，读入一笔费用与酬金率，计算酬金和总钱数*/
 /*例如如果一个用户输入10作为费用，15%作为酬金率，计算结果显示酬金为$1.5总费用为$11.5*/
public class Exercise2_5 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("请输入费用：");
         double feiyong = sc.nextDouble();
         System.out.println("请输入酬金率：");
         double choujinlv = sc.nextDouble()/100.0;
         double choujin = feiyong * choujinlv;
         System.out.printf("酬金为:%f",choujin);
         double zong = feiyong+choujin;
         System.out.printf("总费用为：%f",zong);


     }
}
