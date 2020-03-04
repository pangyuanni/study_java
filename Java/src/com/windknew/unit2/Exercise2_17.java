package com.windknew.unit2;

import java.util.Scanner;

/*
*
*((科学:风寒温度)外面到底有多冷?只有温度是不足以提供答案的，包括风速、相对湿度以 及阳光等其他的因索在确定室外是否寒冷方面都起了很重要的作用。
* 2001年，国家气象服务(NWS) 利用温度和风速计算新的风寒温度，来衡量寒冷程度。计算公式如下所示:
* twc = 35.74 + 0.6215ta - (35.75 * v)^0.16 + (0.4275 * ta)^0.16，这里的ta是室外的温度，以华氏摄氏度为单位，
* 而 v 是速度，以每小时英里数为单位。twc是风寒温度。该公式不适用于风速低于2mph,或温度在-58F以下或41F以上的情况。
* 编写程序，提示用户输入在-58F和41F之间的度数，同时大于或等于2的风速，然后显 示风寒温度。使用 Math.pow(a.b)来计算v^0.16。

*     
* */
public class Exercise2_17 {
    public static void main(String[] args) {
        double Temperature,WindSpeed,WindChillIndex;
        System.out.print("Enter the temperature in Fahrenheit"
                + " between -58 and 41 : ");
        Scanner TemperInput = new Scanner(System.in);
        Temperature = TemperInput.nextDouble();

        System.out.print("Enter the wind speed (>= 2) in miles per hour : ");
        Scanner WindSpeedInput = new Scanner(System.in);
        WindSpeed = WindSpeedInput.nextDouble();


        WindChillIndex = 35.74 + 0.6215 * Temperature
                - 35.75 * Math.pow(WindSpeed,0.16)
                + 0.4275 * Temperature
                * Math.pow(WindSpeed,0.16);
        System.out.println("The wind chill index is " + WindChillIndex);

        WindSpeedInput.close();

    }
}
