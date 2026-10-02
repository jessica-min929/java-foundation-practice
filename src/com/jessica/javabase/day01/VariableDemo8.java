package com.jessica.javabase.day01;

import java.util.Scanner;

public class VariableDemo8 {
    public static void main(String[] args) {
        //键盘录入你的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的体重:");
        double weight = sc.nextDouble();
        System.out.println(weight);
        //键盘录入你的身高
        System.out.println("请输入您的身高：");
        double height = sc.nextDouble();
        System.out.println(height);
        //计算并打印BMI
        System.out.println("这是您的BMI值：");
        double BMI = weight/height;
        System.out.println(BMI);
    }
}
