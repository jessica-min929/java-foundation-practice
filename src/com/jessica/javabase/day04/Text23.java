package com.jessica.javabase.day04;

import java.util.Scanner;

public class Text23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int a = scanner.nextInt();
        if (a%1==0&&a%a==0){
            System.out.println(a+"是质数");
        } else if (a%1==0&&a%a!=0) {
           System.out.println(a+"是合数");
        }
    }
}
