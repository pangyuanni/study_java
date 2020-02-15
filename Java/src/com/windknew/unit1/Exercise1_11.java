package com.windknew.unit1;

public class Exercise1_11{
    public static void main(String [] args){
        long present = 312032486;
        long alltime = 5*365*24*60*60;
        long adder = alltime/7+alltime/45;
        long die = alltime/13;
        System.out.println(present+adder-die);


    }
}
