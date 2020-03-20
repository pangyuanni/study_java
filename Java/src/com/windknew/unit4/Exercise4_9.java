package com.windknew.unit4;

import java.util.Scanner;

public class Exercise4_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character :");
        String character=sc.nextLine();
        if(character.length()!=1){
            System.out.println("You must enter exactly one character!!!");
            System.exit(1);
        }
        char ch=character.charAt(0);
        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
            int interger=(int)ch;
            System.out.println("The Unicode for the character"+ch+" is "+interger);
        }else
            System.exit(1);
    }
}
