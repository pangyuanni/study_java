package com.windknew.unit2;
/*
*  (打印表格)编写程序，显示下面的表格。将浮点数值类型转换为整数。
* a b pow(a, b)
1 2 1
2 3 8
3 4 81
4 5 1024 5 6 15625
*
*
* */
public class Exercise2_18{
    public static void main(String[] args) {
        int a,b,c;

        System.out.println("a    b   pow(a,b)");
        for (int i = 1; i < 6; i++) {
            a = i;b = i+1;c = (int)Math.pow(a,b);
            System.out.println(a + "    " + b + "   " + c);

        }



    }
}
