package com.windknew.unit2;


 /*将磅转化为千克*/

import java.util.Scanner;

public class Exercise2_4 {
    public static void main(String[] args) {
        System.out.println("请输入要转化的磅数：");
        Scanner sc = new Scanner(System.in);
        double bang = sc.nextDouble();
        double qianke = bang*0.454;
        System.out.printf("%f磅是%f千克",bang,qianke);
    }
}
