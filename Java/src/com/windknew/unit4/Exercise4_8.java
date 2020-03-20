package com.windknew.unit4;

import java.util.Scanner;

public class Exercise4_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an ASCII code:");
        int number=sc.nextInt();
        if(number>=1&&number<=127){
            char ch=(char)number;
            System.out.println("The character for ASCII code is :"+ch);
        }
        else
            System.exit(1);

    }
}
