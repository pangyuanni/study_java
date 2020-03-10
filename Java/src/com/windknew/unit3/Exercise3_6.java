package com.windknew.unit3;

import java.util.Scanner;

public class Exercise3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds:");
        double pounds = sc.nextDouble();
        System.out.print("Enter feet:");
        double feet = sc.nextDouble();
        System.out.print("Enter inches:");
        double inches = sc.nextDouble();
        final double KILOS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        final double METERS_PER_FOOT = 0.3048;
        double kilos = pounds*KILOS_PER_POUND;
        double meters = feet*METERS_PER_FOOT+inches*METERS_PER_INCH;
        double bmi = kilos/(meters*meters);
        System.out.println("BMI is "+bmi);
        if(bmi<18.5)
            System.out.println("Underweight");
        else if(bmi<25)
            System.out.println("Normal");
        else if(bmi<30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

    }
}
