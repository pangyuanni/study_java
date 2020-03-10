package com.windknew.unit3;

import java.util.Scanner;

/*
* (游戏：剪刀、石头、布）编写可以玩流行的剪刀-石头-布游戏的程序。
* （剪刀可以剪布，石头可以砸剪刀，而布可以包石头。）程序提示用户随机产生一个数，这个数为 0、1或者 2, 分别表
示石头、剪刀和布。程序提示用户输入值 0、1或者 2, 然后显示一条消息，表明用户和计算机
谁贏了游戏，谁输了游戏，或是打成平手
*
*
*
* */
public class Exercise3_17 {
    public static void main(String[] args) {
        System.out.print("scissor(0), rock(1), paper(2):");
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        int com  = (int)(Math.random()*3);
        String[] names = {"scissor","rock","paper"};
        if(com==player)
            System.out.println("The computer is "+names[com]+". You are "+names[player]+" too. It is a draw.");
        else {
            System.out.print("The computer is " + names[com] + ". You are " + names[player] + ". You ");
            String result = "";
            if ((com == 0 && player == 1) || (com == 1 && player == 2) || (com == 2 && player == 0))
                result = "win";
            else
                result = "lose";
            System.out.println(result);
        }

    }
}
