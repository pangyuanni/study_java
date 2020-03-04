package com.windknew.unit2;


import java.util.Scanner;

/*
*(几何：两点间距离）编写程序，提示用户输人两个点（ xl, yl) 和（x2, y2), 然后显示两点间
的 距 离。计 算 两 点 间 距 离 的 公 式 是 9 注 意：可 以 使 用 Math . pow(a ,0.5)
来计算/T。下面是一个运行示例：
*
* Enter xl and yl: I.5 -3.4 pi#:
Enter x2 and y2: 4 5
The distance between the two points is 8.764131445842194
* */
public class Exercise2_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter xl and yl: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double distance = Math.pow(Math.pow((x2 - x1), 2)+Math.pow((y2 - y1), 2),0.5);
        System.out.println("The distance between the two points is " + distance);

    }
}
