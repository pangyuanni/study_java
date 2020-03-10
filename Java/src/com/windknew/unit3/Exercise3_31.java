package com.windknew.unit3;

import java.util.Scanner;

/*
* (金融：货币兑換）编写一个程序，提示用户输入从美元到人民币的兑换汇率。提示用户输入 0
表示从美元兑换为人民币，输入1表示从人民币兑换为美元。继而提示用户输入美元数量或者
人民币数量，分别兑换为另外一种货币。下面是运行示例：
* */
public class Exercise3_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollar to RMB: ");
        double rate = sc.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int sig = sc.nextInt();
        double in = 0;
        double out = 0;
        String moneyType = "";
        if(sig==0)
            moneyType="dollar";
        else if(sig==1)
            moneyType="RMB";
        else
            System.out.println("Incorrect input");
        if(sig==0||sig==1)
        {
            System.out.print("Enter the "+moneyType+" amount: ");
            in = sc.nextDouble();
            if(sig==0)
            {
                out = in*rate;
                System.out.println("$"+in+" is "+out+" yuan");
            }
            else
            {
                out = in/rate;
                System.out.println(in+" yuan is $"+out);
            }
        }

    }
}
