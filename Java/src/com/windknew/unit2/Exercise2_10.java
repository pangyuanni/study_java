package com.windknew.unit2;

import java.util.Scanner;

/*计算能量*/
/*编写程序计算将水从初始温度加热到最终温度所需的能量，程序应该用户输入
* 水的重量（以千克为单位）以及谁的初始温度和最终温度，计算能量的公式是：
*     Q = M * (最终温度 - 初始温度) * 4184
* M是水的重量，温度以摄氏度为单位，而能量以焦耳为单位*/
public class Exercise2_10 {
    public static void main(String[] args) {
        System.out.println("Pls Enter the amount of watrt in kilograms :");
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble();
        System.out.println("pls Enter the initial temperature :");
        double it = sc.nextDouble();
        System.out.println("Pls Enter final temprature:");
        double ft = sc.nextDouble();
        System.out.println("The energy needed is "+M * ( ft - it ) * 4184);
    }
}
