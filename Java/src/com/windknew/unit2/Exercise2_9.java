package com.windknew.unit2;

import java.util.Scanner;

/*加速度*/
/*平均加速度定义为速度的变化量除以这个变化所用的时间*/
/*编写程序提示用户输入以米/秒为单位的其实速度v0，以米/秒为单位的终止速度v1，以及以米/秒为单位的时间段t,最后显示平均加速度*/
public class Exercise2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLs enter v0 v1 t:");
        String str = sc.nextLine();
        String[] strs =str.split(" ");
        double v0 = Double.parseDouble(strs[0]);
        double v1 = Double.parseDouble(strs[1]);
        double t = Double.parseDouble(strs[2]);
        System.out.println("The average accleration is "+(v1-v0)/t);
        ;
    }
}
