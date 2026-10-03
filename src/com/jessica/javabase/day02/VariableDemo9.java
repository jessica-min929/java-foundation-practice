package com.jessica.javabase.day02;

import java.util.Scanner;

public class VariableDemo9 {
    public static void main(String[] args) {
        ////主入口
        //
        ////一开始没有乘客。
        //
        ////第一站：上去一位乘客
        ////在原有的基础上 + 1
        //
        ////第二站：上去两位乘客，下来一位乘客
        ////第三站：上去两位乘客，下来一位乘客
        ////第四站：下来一位乘客
        ////第五站：上去一位乘客
        ////请问：到了终点站，车上一共几位乘客。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入乘客数量：");
        int passenger = scanner.nextInt();
        /*int passenger = 0;*/
        passenger = passenger + 1;
        passenger = passenger + 2 - 1;
        passenger = passenger + 2 - 1;
        passenger = passenger - 1;
        passenger = passenger + 1;
        System.out.println("到了终点站车上一共有" + passenger +"乘客。");

    }
}
