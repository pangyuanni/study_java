package com.windknew.unit2;


import java.util.Scanner;

/*求一个整数各位数之和*/
/*读取一个在0到1000之间的整数*/
public class Exercise2_6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        int s = num % 100 ,num2;
        int num1 =0;
        if (s>10){
            num1 = num /100;
            int num3 = s / 10;
//            System.out.println(num1);
//            System.out.println(num3);

            num2 = num%10+num1+num3;
//            System.out.println(num%10);
        }
        else{
            num2 = s;
        }

        System.out.printf("各位数之和为：%d",num2);


    }
}
