package com.windknew.unit3;
/*
* (随机点）编写程序，显示矩形中一个随机点的坐标。矩形中心位于（0,0 )、宽 100、高 200。*/
public class Exercise3_16 {
    public static void main(String[] args) {

        int x = (int)(Math.random()*100)-50;
        int y = (int)(Math.random()*200)-100;
        System.out.println("The random point is ("+x+","+y+")");

    }
}
