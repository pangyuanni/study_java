package com.windknew.unit2;

import java.util.Scanner;

/*人口统计，重新编写1.11提示用户输入年数，然后显示这个年数之后的人口值*/
public class Exercise2_11 {
    public static void main(String[] args) {

        System.out.println("Pls input the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        long present = 312032486;
        long alltime = year*365*24*60*60;
        long adder = alltime/7+alltime/45;
        long die = alltime/13;
        System.out.println(present+adder-die);


    }
}
