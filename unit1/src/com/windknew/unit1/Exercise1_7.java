package com.windknew.unit1;

import java.util.*;

public class Exercise1_7{
    public static void main(String [] args){
        double p = 0.0;
        for (int i=0;i<6;i++){
            System.out.println(Math.pow(-1,i)*(2*i+1));
            p = p + (1.0/ Math.pow(-1,i)*(2*i+1));
        }
        System.out.print("到 -1/11 答案是:");
        System.out.println(4*p);
        for (int i=0;i<6;i++){
            System.out.println(Math.pow(-1,i)*(2*i+1));
            p = p + (1.0/ Math.pow(-1,i)*(2*i+1));
        }
        System.out.print("到 1/13 答案是:");
        System.out.println(4*p);
    }
}
