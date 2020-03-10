package com.windknew.unit3;

import java.util.Scanner;

/*

( 商业：检查 ISBN
-
10丨) SBN
-
10 (国际标准书号）以前是一个 10 位整数岣心/3心/5心心Z〆〆,。，最
后的一位 4。是校验和，它是使用下面的公式用另外 9 个数计算出来的： (d1 x 1 + d2 x 2 + d3 x 3 + d4 x 4 + d5 x 5 +d6 x 6 + d7x 7+ d8 x 8 + d9 x 9)% 11
如果校验和为 10, 那么按照 1SBN
-
10 的习惯，最后一位应该表示为 X。编写程序，提示用
户输人前 9 个数，然后显示 10 位 ISBN (包括前面起始位置的 0 >。程序应该读取一个整数输入。

* */
public class Exercise3_9 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbnNum = sc.nextInt();
        int old = isbnNum;
        for(int i=9;i>=1;i--)
        {
            sum+=isbnNum%10*i;
            isbnNum/=10;
        }
        int tail = sum%11;
        System.out.printf("The ISBN-10 number is %09d",old);
        if(tail<10)
            System.out.println(tail);
        else
            System.out.println("X");
    }
}
