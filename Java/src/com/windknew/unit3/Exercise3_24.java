package com.windknew.unit3;
/*
* ( 游戏：挑一张牌）编写程序，模拟从一副 S2 张的牌中选择一张牌。程序应该显示牌的大小
( Ace、2、3、4、5、6、7、8、9、10、Jack、Queen、King) 以及牌的花色（Clubs (黑梅花)、
Diamonds (红方块）、Hearts (红心）、Spades (黑桃））。下面是这个程序的运行示例：
* */
public class Exercise3_24 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*13);
        int dick = (int)(Math.random()*4);
        String[] nums = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] dicks = {"Clubs","Diamonds","Hearts","Spades"};
        System.out.println("The card you picked is "+nums[num]+" of "+dicks[dick]);
    }
}
