package com.windknew.unit2;


/*将英尺转换为米   1 英尺 = 0.305 米*/

import java.util.Scanner;

public class Exercise2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入转换的英尺：");
        double ying = sc.nextDouble();
        double mi = ying*0.305;
        System.out.printf("%f英尺是%f米",ying,mi);
    }
}
