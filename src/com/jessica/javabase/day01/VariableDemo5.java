package com.jessica.javabase.day01;

public class VariableDemo5 {
    //BMI=weight/(height*height)
    public static void main (String[] args){
        double weight = 50;
        double height =1.605;
        double BMI = weight / (height * height);
        System.out.println(BMI);
        //扩展：
        //计算出你当前的身高，在标准BMI下，最多是多少千克？
        //weight=BMI*(height*height)
        double BMI1 = 23.9;
        double weight1 = BMI1 * (height * height);
        System.out.println(weight1);
        }
    }
