package com.windknew.unit1;

public class Exercise1_4{
    public static void main(String[] args){
        System.out.print(String.format("%-5s","a"));
        System.out.print(String.format("%-5s","a^2"));
        System.out.print(String.format("%-5s","a^3"));
        System.out.println();
        for (int j=1;j<5;j++){
            System.out.print(String.format("%-5d",j));
            System.out.print(String.format("%-5d",j*j));
            System.out.print(String.format("%-5d",j*j*j));
            System.out.println();

        }

    }
}
