package com.windknew.unit2;

import java.util.Scanner;

/*求出跑道长度*/
/*假设一个飞机的加速度是a而起飞速度是v可以使用下面这个公式计算最短跑道长度
* 跑道长度 = v的平方/2a*
编写程序提示用户输入速度v和加速度a，然后显示最短跑道长度*/
public class Exercise2_12 {
    public static void main(String[] args) {
        System.out.println("Pls Enter v and a:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        double v = Double.parseDouble(strs[0]);
        double a = Double.parseDouble(strs[1]);
        System.out.println("The minimum runway length for this airplane is "+ (v*v)/(2*a));



    }
}
