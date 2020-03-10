package com.windknew.unit3;

import java.util.Scanner;

/*
* (运输成本）一个运输公司使用下面的函数，根据运输重量（以磅为单位）来计算运输成本（以美元计算）。
*
*         3.5,若 0<w<=1
          5.5,若 1 <w <= 3
 c(w)=    8.5,若 3 <w<10
          10.5,若 10 <w <= 20
*编写一个程序，提示用户输人包裹重量，显示运输成本。如果重童大于 20, 显示一条消息
“ the package cannot be shipped ” 0
*
*  */
public class Exercise3_18 {
    public static void main(String[] args) {
        System.out.print("Enter the weight:");
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double c = 0;
        if(w>20)
            System.out.println("the package cannot be shipped");
        else if(w<=0)
            System.out.println("Invalid input");
        else if(w<=1)
            c=3.5;
        else if(w<=3)
            c=5.5;
        else if(w<=10)
            c=8.5;
        else if(w<=20)
            c=10.5;
        if(c!=0)
            System.out.println("The cost is "+c);

    }
}
