package com.windknew.unit4;

/*
(固上的随机点）计算圆上任意三点构成的三角形的各个角度值
* */
public class Exercise4_6 {
    public static void main(String[] args) {

        final int r = 40;
        final double PI = 3.14159;
        System.out.println("半径r=40,圆心为(0,0)");
        // 随机产生0-2之间的弧度
        double a1 = Math.random() * 2;
        double a2 = Math.random() * 2;
        double a3 = Math.random() * 2;
        System.out.println("随机产生的三个辅助角度为：");
        System.out.printf("a1=%1.2fπ a2=%1.2fπ a3=%1.2fπ", a1, a2, a3);
        // 产生三个坐标点
        double x1 = r * Math.cos(a1);
        double y1 = r * Math.sin(a1);
        double x2 = r * Math.cos(a2);
        double y2 = r * Math.sin(a2);
        double x3 = r * Math.cos(a3);
        double y3 = r * Math.sin(a3);
        System.out.println("\n随机产生的三个点的坐标为：");
        System.out.printf("(%1.2f , %1.2f)\n", x1, y1);
        System.out.printf("(%1.2f , %1.2f)\n", x2, y2);
        System.out.printf("(%1.2f , %1.2f)\n", x3, y3);
        // 计算三角形各个边长
        double s1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double s2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double s3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        System.out.println("三条边的长度为：");
        System.out.printf("s1=%1.2f s2=%1.2f s3=%1.2f", s1, s2, s3);
        // 计算三角形三个角的度数
        double A = (Math.acos((s1 * s1 - s2 * s2 - s3 * s3) / (-2 * s2 * s3)))
                / PI;
        double B = (Math.acos((s2 * s2 - s1 * s1 - s3 * s3) / (-2 * s1 * s3)))
                / PI;
        double C = (Math.acos((s3 * s3 - s2 * s2 - s1 * s1) / (-2 * s1 * s2)))
                / PI;
        System.out.println("\n三角形的三个角度为：");
        System.out.printf("A=%1.2fπ B=%1.2fπ C=%1.2fπ", A, B, C);
    }
}
