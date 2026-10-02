package com.jessica.javabase.day01;

import java.util.Scanner;

public class VariableDemo7 {
    public static void main(String[] args) {
        /*定义两个整数类型的变量num1和num2,键盘录入数据分别为两个变量赋值。
    求两数的和并进行打印。
     */
        //1.找到Scanner这个打工人
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println(num1);

        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println(num2);

        System.out.println("两数之和为：");
        int a = num1 + num2;//变量a为两数之和
        System.out.println(a);
    }

}
