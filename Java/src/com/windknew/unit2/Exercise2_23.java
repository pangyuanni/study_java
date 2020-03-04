package com.windknew.unit2;

/*
* (驾驶费用）编写一个程序，提示用户输入驾驶的距离、以每加仑多少英里的汽车燃油性能，以及每加仑的价格，然后显示旅程的费用。
*
* */


import java.util.Scanner;

public class Exercise2_23 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the driving distance : ");
        double distance = in.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles = in.nextDouble();
        System.out.print("Enter price per gallon");
        double price = in.nextDouble();
        System.out.println("The cost of driving is: " + distance / miles * price);
    }

}
