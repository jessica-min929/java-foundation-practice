package com.jessica.javabase.day04;

import java.util.Scanner;

public class Text22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = scanner.nextInt();
        for (int i =1;i<a;i++){
            if (i*i==a){
                System.out.println(i+"就是"+"a的平方根");
                break;
            } else if (i*i>a) {
                System.out.println(i-1+"就是"+"a的平方根的整数部分");
                break;
            }
        }
    }
}
