package com.windknew.unit4;

/*
*(几何：估算面私）从网址 www.gps-data-tem.com/map 上面找到 Georgia 州的 Atlanta 、
*  Florida 州 的 Orlando、Georgia 州的 Savannah、North Carolina 的 Charlotte, 计算被这四个城市所围起来的
区域的面积。（提示：使用编程练习题 4.2 中的公式来计算两个城市之间的距离。将多边形分为两
个三角形，使用编程练习题 2.19 中的公式计»三角形面积。）
* */
public class Exercise4_3 {
    public static void main(String[] args) {
        double atlantaLatitude = 33.7490;
        double atlantaLongitude = 84.3880;

        double x1 =Math.toRadians(atlantaLatitude);
        double y1 =Math.toRadians(atlantaLongitude);

        double orlandoLatitude = 28.5383;
        double orlandoLongitude = 81.3792;

        double x2 =Math.toRadians(orlandoLatitude);
        double y2 =Math.toRadians(orlandoLongitude);

        double savannahLatitude = 32.0809;
        double savannahLongitude = 81.0912;

        double x3 = Math.toRadians(savannahLatitude);
        double y3 = Math.toRadians(savannahLongitude);

        double charlotteLatitude = 35.2271;
        double charlotteLongitude = 80.8431;

        double x4 = Math.toRadians(charlotteLatitude);
        double y4 = Math.toRadians(charlotteLongitude);

        double r = 6371.01;

        double arccosA = Math.sin(x1)*Math.sin(x2)+
                Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2);

        double A = r * Math.acos(arccosA);//the distance is from Atlanta to Orlando

        double arccosB = Math.sin(x2) *Math.sin(x3)+
                Math.cos(x2) *Math.cos(x3)*Math.cos(y2-y3);

        double B = r * Math.acos(arccosB);//the distance is from Orlando to Savannah

        double arccosC = Math.sin(x3) *	Math.sin(x4)+
                Math.cos(x3) *Math.cos(x4)*Math.cos(y3-y4);

        double C = r * Math.acos(arccosC);//the distance is from Savannah to Charlotte

        double arccosD = Math.sin(x1) * Math.sin(x4)+
                Math.cos(x1) *Math.cos(x4)*Math.cos(y1-y4);

        double D = r * Math.acos(arccosD);//the distance is from Atlanta to Charlotte

        double arccosML = Math.sin(x2) * Math.sin(x4)+
                Math.cos(x2) * Math.cos(x4) * Math.cos(y2-y4);
        // The quadrilateral middle line;

        double ML = r * Math.acos(arccosML);

        double S1 = (A +D+ML)/2;
        double S1_1 = S1* (S1-A)*(S1-D)*(S1-ML);
        double area1 =  Math.sqrt(S1_1);

        double S2 = (B+C+ML)/2;
        double S2_1 =S2 *(S2-B)*(S2-C)*(S2-ML);
        double area2 = Math.sqrt(S2_1);

        double area = area1 +area2 ;
        System.out.println("The area is : " + area);
    }
}
