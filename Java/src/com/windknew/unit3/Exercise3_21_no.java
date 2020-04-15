package com.windknew.unit3;

import java.util.Scanner;

public class Exercise3_21_no {
        public static void main(String argv[]){
            while(true){
                System.out.println("Enter year: (e,g.,2012):");
                Scanner sc=new Scanner(System.in);
                int y=sc.nextInt();
                System.out.print("Enter month: 1-12: ");
                int m=sc.nextInt();
                System.out.print("Enter the day of the month:");
                int d=sc.nextInt();
                long amount=0;
                int[] mdays = {31,28,31,30,31,30,31,31,30,31,30,31};
                if((y%4==0&&y%100!=0)||(y%400==0))
                    mdays[1]=29;
                amount+=365*(y-1);
                for(int i=1;i<m;i++){
                    amount+=mdays[i];
                }
                amount+=d;
                int week=(int) (amount%7);

                String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
                System.out.println("Day of the week is "+days[week]);
            }
        }

}

