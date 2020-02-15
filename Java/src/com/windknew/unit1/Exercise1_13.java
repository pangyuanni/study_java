package com.windknew.unit1;

public class Exercise1_13 {
    public static void main(String[] args) {
        float a = 3.4f, b = 50.2f, e = 44.5f, c = 2.1f, d = 0.55f, f = 5.9f;
        float x = (e * d - b * f) / (a * d - b * c);
        float y = (a * f - e * c) / (a * d - b * c);
        System.out.println(x);
        System.out.println(y);

    }
}